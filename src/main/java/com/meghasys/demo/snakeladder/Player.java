package com.meghasys.demo.snakeladder;

public class Player {
    private final String name;
    private int location;

    public Player(String name, int currLoc) {
        this.name = name;
        this.location = currLoc;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int loc){
        this.location = loc;
    }

    public void print(){
        System.out.println("Player "+name+" at location: "+ location);
    }

}
