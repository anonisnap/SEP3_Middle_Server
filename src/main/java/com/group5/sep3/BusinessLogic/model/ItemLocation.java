package com.group5.sep3.BusinessLogic.model;

public class ItemLocation {

    private Location location;
    private Item item;
    private int amount;

    public ItemLocation(Location location, Item item, int amount) {
        this.location = location;
        this.item = item;
        this.amount = amount;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
