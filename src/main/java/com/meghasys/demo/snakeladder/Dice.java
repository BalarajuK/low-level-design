package com.meghasys.demo.snakeladder;

public class Dice {

    private final int count;

    public Dice(int count) {
        this.count = count;
    }

    public int roll(){
        return (int)(Math.random()*(count*6 - count))+1;
    }
}
