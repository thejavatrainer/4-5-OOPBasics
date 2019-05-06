package com.frequentis.training.oop.generics;

public class GameRunner<T extends Startable> {

    private final T t;

    public GameRunner(T t){
        this.t = t;
    }

    public void start(){
        System.out.println("prepare the game");
        t.start();
        System.out.println("Wrap up");
    }

    public static void main(String[] args) {
        ChessGame chessGame = new ChessGame();
        GameRunner<ChessGame> gameRunner = new GameRunner<ChessGame>(chessGame);
        gameRunner.start();
    }

}
