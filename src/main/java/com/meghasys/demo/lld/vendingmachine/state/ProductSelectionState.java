package com.meghasys.demo.lld.vendingmachine.state;

import com.meghasys.demo.lld.vendingmachine.IState;
import com.meghasys.demo.lld.vendingmachine.Item;
import com.meghasys.demo.lld.vendingmachine.VendingMachine;

public class ProductSelectionState implements IState {

    private final double amount;
    private int itemCode;

    public ProductSelectionState(double amount) {
        this.amount = amount;
    }

    public Item dispenseItems(VendingMachine machine){

        Item item = machine.dispenseItem(itemCode, amount);
        if(item != null){
            DispenseItem state = new DispenseItem(item);
            machine.setState(state);
        }
        else {
            machine.setState(new IdleState());
        }
        return item;

    }

    public void selectItem(int itemCode){
        this.itemCode = itemCode;
    }
}
