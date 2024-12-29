package com.meghasys.demo.lld.vendingmachine;

public class Item {
    private final ItemType type;
    private final double price;

    public Item(ItemType type, double price) {
        this.type = type;
        this.price = price;
    }

    public ItemType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
