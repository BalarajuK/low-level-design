package com.meghasys.demo.lld.vendingmachine.state;

import com.meghasys.demo.lld.vendingmachine.IState;
import com.meghasys.demo.lld.vendingmachine.VendingMachine;

// Idle, CoinAccept, ItemSelection, Dispense
public class IdleState implements IState {

    public void newItemRequest(VendingMachine machine){
        machine.setState(new CoinAcceptState());
    }

}
