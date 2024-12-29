package com.meghasys.demo.lld.vendingmachine;

import com.meghasys.demo.lld.vendingmachine.state.CoinAcceptState;
import com.meghasys.demo.lld.vendingmachine.state.ProductSelectionState;

public class TestVendingMachine {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addItem(101, new Item(ItemType.COKE, 2));
        machine.addItem(102, new Item(ItemType.WATER, 1));
        machine.addItem(103, new Item(ItemType.MILK, 1));

        System.out.println("=================================");
        System.out.println("Start buying");

        IState state = machine.getState();
        state.newItemRequest(machine);

        CoinAcceptState coinState = (CoinAcceptState) machine.getState();
        coinState.addCurrency(1);

        coinState.startProductSelection(machine);

        ProductSelectionState prodSel = (ProductSelectionState) machine.getState();
        prodSel.selectItem(102);
        Item item = prodSel.dispenseItems(machine);

        System.out.println("Item from machine = "+item.getType());




    }
}
