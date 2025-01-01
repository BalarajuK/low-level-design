package com.meghasys.demo.lld.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class ItemShelf {
    private final List<Item> items;
    private int code;
    private boolean isSoldOut;

    public ItemShelf() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public Item removeItem() {
        if(!items.isEmpty()){
            Item item = items.remove(items.size() - 1);
            if(items.isEmpty()){
                setSoldOut(true);
            }
            return item;
        }
        return null;
    }

    public void addItem(Item item) {
        this.items.add(item);
        setSoldOut(false);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }

    public void setSoldOut(boolean soldOut) {
        isSoldOut = soldOut;
    }
}
