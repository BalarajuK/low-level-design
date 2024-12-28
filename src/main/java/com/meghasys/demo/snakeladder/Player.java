package com.meghasys.demo.snakeladder;

public class Player {
    private String name;
    private int currLoc;

    public Player(String name, int currLoc) {
        this.name = name;
        this.currLoc = currLoc;
    }

    public String getName() {
        return name;
    }

    public int getCurrLoc() {
        return currLoc;
    }

    public int move(int loc){
        this.currLoc = loc;
        return this.currLoc;
    }

    public void print(){
        System.out.println("Player "+name+" at location: "+currLoc);
    }

}
