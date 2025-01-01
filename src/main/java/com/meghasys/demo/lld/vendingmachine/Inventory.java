package com.meghasys.demo.lld.vendingmachine;

import java.util.List;

public class Inventory {
    private final ItemShelf[] inventory;

    public Inventory() {
        int itemCode = 101;

        inventory = new ItemShelf[10];
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf self = new ItemShelf();
            inventory[i] = self;
            self.setCode(itemCode);
            itemCode++;
        }
    }

    public void addItem(int itemCode, Item item) {
        for (ItemShelf self : inventory) {
            if (self.getCode() == itemCode) {
                self.addItem(item);
            }
        }
    }

    public Item dispenseItem(int itemCode, double amount) {
        for (ItemShelf self : inventory) {
            if (self.getCode() == itemCode && !self.isSoldOut()) {
                List<Item> items = self.getItems();
                if(!items.isEmpty()){
                    Item item = self.removeItem();
                    if(item.getPrice()>amount){
                        self.addItem(item);
                        return null;
                    }
                    return item;
                }
            }
        }
        return null;
    }
}
