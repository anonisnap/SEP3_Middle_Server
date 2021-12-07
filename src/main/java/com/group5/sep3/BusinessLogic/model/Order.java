package com.group5.sep3.BusinessLogic.model;

import java.util.ArrayList;

public class Order {

    private int id;

    private ArrayList<OrderEntry> orderEntries;

    private int orderNumber;

    public Order(int orderNumber) {

        this.orderNumber = orderNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ArrayList<OrderEntry> getOrderEntries() {
        return orderEntries;
    }

    public void setOrderEntries(ArrayList<OrderEntry> orderEntries) {
        this.orderEntries = orderEntries;
    }

    public void addOrderEntry(OrderEntry orderEntry){
        orderEntries.add(orderEntry);
    }

}
