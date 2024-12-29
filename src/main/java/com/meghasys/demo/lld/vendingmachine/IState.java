package com.meghasys.demo.lld.vendingmachine;

public interface IState {

    default void newItemRequest(VendingMachine machine){
        throw new RuntimeException();
    }

    default void startProductSelection(VendingMachine machine){
        throw new RuntimeException();
    }

    default Item dispenseItem(VendingMachine machine){
        throw new RuntimeException();
    }

    default Item dispenseItems(VendingMachine machine){
        throw new RuntimeException();
    }
}
