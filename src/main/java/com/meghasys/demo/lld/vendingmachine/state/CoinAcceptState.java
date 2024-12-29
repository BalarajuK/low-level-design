package com.meghasys.demo.lld.vendingmachine.state;

import com.meghasys.demo.lld.vendingmachine.IState;
import com.meghasys.demo.lld.vendingmachine.VendingMachine;

public class CoinAcceptState implements IState {

    private double amount;
    public void startProductSelection(VendingMachine machine){
        ProductSelectionState state = new ProductSelectionState(amount);
        machine.setState(state);
    }

    public void addCurrency(int amount){
        this.amount = amount;
    }


}
