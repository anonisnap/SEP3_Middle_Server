package com.group5.sep3.BusinessLogic.model;

public class OrderEntry {


    private int id;
    private int orderId;
    private int amount;
    private boolean isPicked;
    private Item item;

    public OrderEntry(int id, int orderId, int amount, boolean isPicked, Item item) {
        this.id = id;
        this.orderId = orderId;
        this.amount = amount;
        this.isPicked = isPicked;
        this.item = item;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getAmount() {
        return amount;
    }

    public Item getItem() {
        return item;
    }

    // because of spring the methode name HAS to be start with get
    public boolean getIsPicked() {
        return isPicked;
    }

    public int getId() {
        return id;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setIsPicked(boolean picked) {
        isPicked = picked;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderEntry{" +
                "amount=" + amount +
                ", item=" + item +
                '}';
    }
}
