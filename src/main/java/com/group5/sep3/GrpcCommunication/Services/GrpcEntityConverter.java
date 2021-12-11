package com.group5.sep3.GrpcCommunication.Services;

import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.BusinessLogic.model.Order;
import com.group5.sep3.BusinessLogic.model.OrderEntry;
import protos.ItemServiceOuterClass.*;
import protos.LocationServiceOuterClass.*;
import protos.OrderServiceOuterClass.*;

import java.util.ArrayList;

public class GrpcEntityConverter {

    
    public static class FromGEntity{

        public static Order convertToOrder(gOrder requestGOrder) {
            Order order = new Order(requestGOrder.getOrderNumber());
            order.setOrderNumber(requestGOrder.getOrderNumber());
            order.setId(requestGOrder.getId());
            Location location = new Location(requestGOrder.getOrderLocation().getId(), requestGOrder.getOrderLocation().getDescription());
            order.setLocation(location);

            ArrayList<OrderEntry> orderEntries = new ArrayList<>();
            for (gOrderEntry gOrderEntry : requestGOrder.getOrderEntriesList()) {

                OrderEntry orderEntry =
                        new OrderEntry(gOrderEntry.getOrderId(), gOrderEntry.getAmount(), convertToItem(gOrderEntry.getItem()));

                orderEntries.add(orderEntry);
            }

            order.setOrderEntries(orderEntries);
            return order;
        }


        public static Item convertToItem(gItem requestGItem){
            return new Item(requestGItem.getId(),
                    requestGItem.getItemName(),
                    requestGItem.getLength(),
                    requestGItem.getWidth(),
                    requestGItem.getHeight(),
                    requestGItem.getWeight());
        }

    }
    
    public static class FromEntity{

        public static gOrder convertToGOrder(Order order) {
            // list for generated gOrder entries
            ArrayList<gOrderEntry> gOrderEntries = new ArrayList<>();


            for (OrderEntry orderEntry : order.getOrderEntries()) {
                // building ever gOrder entry from order entry
                gOrderEntry buildGOrderEntry = gOrderEntry
                        .newBuilder()
                        .setOrderId(orderEntry.getOrderId())
                        .setAmount(orderEntry.getAmount())
                        .setItem(convertToGItem(orderEntry.getItem()))
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
                    .setOrderLocation(GrpcEntityConverter.FromEntity.convertToGLocation(order.getLocation()))
                    .build();
        }


        public static gItem convertToGItem(Item item){
            return gItem.newBuilder()
                    .setId(item.getId())
                    .setItemName(item.getItemName())
                    .setHeight(item.getHeight())
                    .setLength(item.getLength())
                    .setWidth(item.getWidth())
                    .setWeight(item.getWeight()).build();

        }

        public static gLocation convertToGLocation(Location location){
            return gLocation.newBuilder().setId(location.getId()).setDescription(location.getDescription()).build();
        }

        
    }

    

    
    
    
}
