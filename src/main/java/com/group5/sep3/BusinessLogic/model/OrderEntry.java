package com.group5.sep3.BusinessLogic.model;

public class OrderEntry {


    private int orderId;
    private int amount;

    private int itemId;


    public OrderEntry(int orderId, int amount, int itemId) {
        this.orderId = orderId;
        this.amount = amount;
        this.itemId = itemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getAmount() {
        return amount;
    }

    public int getItemId() {
        return itemId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
