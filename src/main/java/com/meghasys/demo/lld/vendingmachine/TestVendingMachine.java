package com.meghasys.demo.lld.vendingmachine;

import com.meghasys.demo.lld.vendingmachine.state.CoinAcceptState;
import com.meghasys.demo.lld.vendingmachine.state.ProductSelectionState;

import java.util.Scanner;
import java.util.function.Supplier;

public class TestVendingMachine {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addItem(101, new Item(ItemType.COKE, 2));
        machine.addItem(102, new Item(ItemType.WATER, 1));
        machine.addItem(103, new Item(ItemType.MILK, 1));

        System.out.println("=================================");
        System.out.println("Start buying");

        Scanner scanner = new Scanner(System.in);
        buyItem(machine, () -> {
            System.out.print("Insert amount: ");
            return scanner.nextInt();
        }, () -> {
            System.out.print("Select Item[101/102/103]: ");
            return scanner.nextInt();
        });

    }

    private static void buyItem(VendingMachine machine, Supplier<Integer> amount, Supplier<Integer> itemCode) {
        IState state = machine.getState();
        state.newItemRequest(machine);

        CoinAcceptState coinState = (CoinAcceptState) machine.getState();
        coinState.addCurrency(amount.get());

        coinState.startProductSelection(machine);

        ProductSelectionState prodSel = (ProductSelectionState) machine.getState();
        prodSel.selectItem(itemCode.get());
        Item item = prodSel.dispenseItems(machine);
        if(item!=null){
            System.out.println("Dispensed an item = " + item.getType());
        }
        System.out.println("Collect change: " + prodSel.getAmount());
    }
}
