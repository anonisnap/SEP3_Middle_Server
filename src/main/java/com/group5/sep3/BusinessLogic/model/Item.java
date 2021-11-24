package com.group5.sep3.BusinessLogic.model;

public class Item {
    private int itemId;
    private String itemName;
    private double length, width, height, weight;

    public Item(int itemId, String itemName, double length, double width, double height, double weight) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
