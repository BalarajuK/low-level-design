package com.meghasys.demo.snakeladder;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private static final int WINNING_SCORE = 100;
    private final Map<Integer, IObject> objectMap;

    public Board(int[][] snakes, int[][] ladders) {
        objectMap = new HashMap<>();
        for (int[] loc : snakes) {
            objectMap.put(loc[0], new Snake(loc[1] - loc[0]));
        }

        for (int[] loc : ladders) {
            objectMap.put(loc[0], new Ladder(loc[1] - loc[0]));
        }
    }


    public boolean move(Player player, int points) {
        System.out.println("Player " + player.getName() + ": " + points);

        nextMove(player, player.getLocation() + points);

        if (isWin(player)) {
            return true;
        }

        IObject object = objectMap.get(points);
        if (object != null) {
            int loc = object.move() + player.getLocation();
            nextMove(player, loc);
        }


        return isWin(player);
    }

    private static void nextMove(Player player, int loc) {
        if (loc <= WINNING_SCORE) {
            player.setLocation(loc);
        }
    }

    private boolean isWin(Player player) {
        return player.getLocation() == WINNING_SCORE;
    }

}
