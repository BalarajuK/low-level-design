package com.meghasys.demo.lld.vendingmachine;

import com.meghasys.demo.lld.vendingmachine.state.IdleState;

public class VendingMachine {

    private final Inventory inventory;
    private IState state;

    public VendingMachine() {
        this.inventory = new Inventory();
        state = new IdleState();
    }

    public void addItem(int code, Item item){
        inventory.addItem(code, item);
    }

    public Item dispenseItem(int itemCode, double amount){
        return inventory.dispenseItem(itemCode, amount);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
