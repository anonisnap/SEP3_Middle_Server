package com.group5.sep3.BusinessLogic.model;

public class WarehouseItemLocation {
    private Location location;
    private WarehouseItem warehouseItem;
    private int amount;

    public WarehouseItemLocation(Location location, WarehouseItem warehouseItem, int amount) {
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

    public WarehouseItem getWarehouseItem() {
        return warehouseItem;
    }

    public void setWarehouseItem(WarehouseItem warehouseItem) {
        this.warehouseItem = warehouseItem;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
