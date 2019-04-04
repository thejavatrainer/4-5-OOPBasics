package com.frequentis.training.oop;

import java.util.List;

public class HelloWorldReally {

    static {
        System.out.println("Hello from OOP training!");
        System.exit(100);
    }

    public static void main(String[] args) {
        Position pos1 = new Position(null, null);
        Bishop whiteBishop = new Bishop(pos1);
        Position pos2 = new Position(null, null);
        King blackKing = new King(pos2);
        Movable[] movables = new Movable[]{whiteBishop, blackKing};
    }



}
