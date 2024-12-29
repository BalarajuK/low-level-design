package com.meghasys.demo.lld.vendingmachine;

public class Inventory {
    private final ItemShelf[] inventory;

    public Inventory() {
        int itemCode = 101;

        inventory = new ItemShelf[10];
        for(int i = 0; i< inventory.length; i++){
            ItemShelf self = new ItemShelf();
            inventory[i] = self;
            self.setCode(itemCode);
            itemCode++;
        }
    }

    public void addItem(int itemCode, Item item){
        for (ItemShelf self : inventory){
            if(self.getCode() == itemCode){
                self.setItem(item);
                self.setSoldOut(false);
            }
        }
    }

    public Item dispenseItem(int itemCode, double amount){
        for(ItemShelf self : inventory){
            if(self.getCode() == itemCode && self.getItem().getPrice()<=amount){
                self.setSoldOut(true);
                return self.getItem();
            }
        }
        return null;
    }
}
