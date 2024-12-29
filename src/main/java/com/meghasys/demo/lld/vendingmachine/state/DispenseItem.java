package com.meghasys.demo.lld.vendingmachine.state;

import com.meghasys.demo.lld.vendingmachine.IState;
import com.meghasys.demo.lld.vendingmachine.Item;
import com.meghasys.demo.lld.vendingmachine.VendingMachine;

public class DispenseItem implements IState {
    private final Item item;

    public DispenseItem(Item item) {
        this.item = item;
    }

    public Item dispenseItem(VendingMachine machine){
        machine.setState(new IdleState());
        return item;
    }
}
