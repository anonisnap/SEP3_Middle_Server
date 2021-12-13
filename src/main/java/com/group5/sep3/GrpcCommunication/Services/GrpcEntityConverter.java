package com.group5.sep3.GrpcCommunication.Services;

import com.group5.sep3.BusinessLogic.model.*;
import protos.InventoryServiceOuterClass.*;
import protos.ItemServiceOuterClass.*;
import protos.LocationServiceOuterClass.*;
import protos.OrderServiceOuterClass.*;

import java.util.ArrayList;

public class GrpcEntityConverter {


    public static class FromGEntity {

        public static Order toOrder(gOrder requestGOrder) {
            Order order = new Order(requestGOrder.getOrderNumber());
            order.setOrderNumber(requestGOrder.getOrderNumber());
            order.setId(requestGOrder.getId());
            Location location = new Location(requestGOrder.getLocation().getId(), requestGOrder.getLocation().getDescription());
            order.setLocation(location);

            ArrayList<OrderEntry> orderEntries = new ArrayList<>();
            for (gOrderEntry gOrderEntry : requestGOrder.getOrderEntriesList()) {

                OrderEntry orderEntry =
                        new OrderEntry(gOrderEntry.getId(), gOrderEntry.getOrderId(), gOrderEntry.getAmount(), gOrderEntry.getIsPicked(), toItem(gOrderEntry.getItem()));

                orderEntries.add(orderEntry);
            }

            order.setOrderEntries(orderEntries);
            return order;
        }

        public static Item toItem(gItem requestGItem) {
            return new Item(requestGItem.getId(),
                    requestGItem.getItemName(),
                    requestGItem.getLength(),
                    requestGItem.getWidth(),
                    requestGItem.getHeight(),
                    requestGItem.getWeight());
        }

        public static Location toLocation(gLocation gLocation) {
            return new Location(gLocation.getId(), gLocation.getDescription());
        }

        public static Inventory toInventory(gInventory gInventory) {

            return new Inventory(gInventory.getId(), toLocation(gInventory.getLocation()),
                    toItem(gInventory.getItem()), gInventory.getAmount());

        }
    }

    public static class FromEntity {

        public static gOrder toGOrder(Order order) {
            // list for generated gOrder entries
            ArrayList<gOrderEntry> gOrderEntries = new ArrayList<>();


            for (OrderEntry orderEntry : order.getOrderEntries()) {
                // building ever gOrder entry from order entry
                gOrderEntry buildGOrderEntry = gOrderEntry
                        .newBuilder()
                        .setId(orderEntry.getId())
                        .setIsPicked(orderEntry.getIsPicked())
                        .setOrderId(orderEntry.getOrderId())
                        .setAmount(orderEntry.getAmount())
                        .setItem(toGItem(orderEntry.getItem()))
                        .build();

                // add to list
                gOrderEntries.add(buildGOrderEntry);
            }
            //
            // build order and return
            return gOrder.newBuilder()
                    .setId(order.getId())
                    .addAllOrderEntries(gOrderEntries)
                    .setOrderNumber(order.getOrderNumber())
                    .setLocation(GrpcEntityConverter.FromEntity.toGLocation(order.getLocation()))
                    .build();
        }

        public static gItem toGItem(Item item) {
            return gItem.newBuilder()
                    .setId(item.getId())
                    .setItemName(item.getItemName())
                    .setHeight(item.getHeight())
                    .setLength(item.getLength())
                    .setWidth(item.getWidth())
                    .setWeight(item.getWeight()).build();

        }

        public static gLocation toGLocation(Location location) {
            return gLocation.newBuilder().setId(location.getId()).setDescription(location.getDescription()).build();
        }

        public static gInventory toGInventory(Inventory inventory){
            gLocation gLocation = toGLocation(inventory.getLocation());
            gItem gItem = toGItem(inventory.getItem());
            return gInventory.newBuilder().setId(inventory.getId()).setLocation(gLocation).setItem(gItem).setAmount(inventory.getAmount()).build();
        }

    }

}
