package com.meghasys.demo.snakeladder;

import java.util.ArrayDeque;
import java.util.Queue;

public class Game {

    public static void main(String[] args) {
        int[][] snakes = new int[][]{
                {97, 78}, {62, 18},  {88, 24}, {62,19},{95,75},{17,7},{32,13}
        };

        int[][] ladders = new int[][]{
                {4, 14}, {9, 31}, {21, 42}, {28, 76}, {71, 92}, {88, 99}, {4, 14}, {8, 10}
        };
        Board board = new Board(snakes, ladders);



        Dice dice = new Dice(1);
        Queue<Player> players = new ArrayDeque<>();
        players.offer(new Player("A", 1));
        players.offer(new Player("B", 1));
        System.out.println("======================================");
        System.out.println("Snake And Ladder Game");
        System.out.println("======================================");
        boolean gameOver = false;
        while (!gameOver && !players.isEmpty()) {
            Player player = players.poll();
            int nextScore = dice.roll();
            System.out.println("Player " + player.getName() + " score:" + nextScore);
            if (board.move(player, nextScore)) {
                System.out.println("Player " + player.getName() + " won the game");
                gameOver = true;
            }
            players.offer(player);

            player.print();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
