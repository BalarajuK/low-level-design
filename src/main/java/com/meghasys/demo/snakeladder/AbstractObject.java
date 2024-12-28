package com.meghasys.demo.snakeladder;

public class AbstractObject implements IObject{

    private final int moves;
    public AbstractObject(int xMove) {
        this.moves = xMove;
    }

    @Override
    public int move() {
        return moves;
    }
}
