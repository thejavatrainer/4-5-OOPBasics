package com.frequentis.training.oop;

import com.frequentis.training.oop.exceptions.IllegalMoveException;
import sun.misc.GC;

import java.util.concurrent.TimeUnit;

public class ChessProgram {

    public static void main(String[] args) throws InterruptedException, IllegalMoveException {
        createSomeObjectsAndUseThem();
        Runtime.getRuntime().gc();
    }

    private static void createSomeObjectsAndUseThem() throws IllegalMoveException {
        Bishop bishop = new Bishop(null);
     //   Bishop secondBishop = new Bishop(null);
        bishop.move(null);
    }
}
