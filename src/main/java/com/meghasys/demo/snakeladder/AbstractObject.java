package com.meghasys.demo.snakeladder;

public class AbstractObject implements IObject{

    private int xMove;
    public AbstractObject(int xMove) {
        this.xMove = xMove;
    }

    @Override
    public int move() {
        return xMove;
    }
}
