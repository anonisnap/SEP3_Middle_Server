package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.OrderModel;
import com.group5.sep3.BusinessLogic.model.Order;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;

import java.util.Collection;

public class OrderModelImpl implements OrderModel {

    private final RestManager<Order> orderRestManager;

    public OrderModelImpl(RestManager<Order> orderRestManager) {
        this.orderRestManager = orderRestManager;
    }

    @Override
    public Order register(Order order) {
        return orderRestManager.create(order);
    }

    @Override
    public Order get(Order order) {
        return orderRestManager.get(order);
    }

    @Override
    public Order update(Order order) {
        return orderRestManager.update(order);
    }

    @Override
    public Collection<Order> getAll() {
        return orderRestManager.getAll();
    }

    @Override
    public Order remove(Order order) {
        return orderRestManager.delete(order);
    }

}
