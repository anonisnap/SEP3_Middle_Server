package com.group5.sep3.BusinessLogic.model;

public class ItemLocation {
    private Location location;
    private Item warehouseItem;
    private int amount;

    public ItemLocation(Location location, Item warehouseItem, int amount) {
        this.location = location;
        this.warehouseItem = warehouseItem;
        this.amount = amount;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Item getWarehouseItem() {
        return warehouseItem;
    }

    public void setWarehouseItem(Item warehouseItem) {
        this.warehouseItem = warehouseItem;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
