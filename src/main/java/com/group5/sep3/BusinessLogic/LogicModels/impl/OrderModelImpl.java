package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.InventoryModel;
import com.group5.sep3.BusinessLogic.LogicModels.OrderModel;
import com.group5.sep3.BusinessLogic.model.Inventory;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.BusinessLogic.model.Order;
import com.group5.sep3.BusinessLogic.model.OrderEntry;
import com.group5.sep3.DataBaseCommunication.RestManagers.OrderRestManager;
import com.group5.sep3.LogicModelFactory;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;

import java.util.ArrayList;
import java.util.List;

public class OrderModelImpl implements OrderModel {


    private final OrderRestManager orderRestManager;

    public OrderModelImpl(OrderRestManager orderRestManager) {
        this.orderRestManager = orderRestManager;
    }

    @Override
    public Order register(Order order) {
        //When registering an order, a location with the order number will be created
        //this location will have the prefix "O" + order number
        //items will be moved to this location when processing order
        // id set as zero as its not registered in the database
        int nextOrderNumber = getNextOrderNumber();
        order.setOrderNumber(nextOrderNumber);
        order.setLocation(new Location(0,"o"+order.getOrderNumber()));
        return orderRestManager.create(order);
    }

    @Override
    public Order get(int order) {
        return orderRestManager.get(order);
    }

    @Override
    public Order update(Order order) {
        return orderRestManager.update(order);
    }

    @Override
    public ArrayList<Order> getAll() {
        return orderRestManager.getAll();
    }

    @Override
    public boolean remove(int order) {

        return orderRestManager.delete(order);
    }

    private int getNextOrderNumber(){
        int i = orderRestManager.getLatestOrderNumber();
        if (i == 0) i = 3000;
        return ++i;
    }

    @Override
    public boolean processOrder(Order order, List<Inventory> pickInventories) throws Exception {


        InventoryModel inventoryModel = (InventoryModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.INVENTORY);

        int orderLocationId = order.getLocation().getId();
        for (Inventory pickInventory : pickInventories) {
            pickInventory.getLocation().setId(orderLocationId);
            try {
                inventoryModel.update(pickInventory);
            } catch (Exception e) {
                // Possible to make custom exception here
                throw new Exception("Could not pick items to order.");
            }
        }

        Order updated =  orderRestManager.update(order);

        return true;
    }
}
