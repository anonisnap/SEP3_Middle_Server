package com.group5.sep3.BusinessLogic.model;

public class OrderEntry {


    private int orderId;
    private int amount;
    private Item item;


    public OrderEntry(int orderId, int amount, Item item) {
        this.orderId = orderId;
        this.amount = amount;
        this.item = item;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderEntry{" +
                "amount=" + amount +
                ", item=" + item +
                '}';
    }
}
