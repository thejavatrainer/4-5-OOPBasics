package com.frequentis.training.oop.caveats;

import com.frequentis.training.oop.Bishop;
import com.frequentis.training.oop.ChessPiece;
import com.frequentis.training.oop.Position;
import com.frequentis.training.oop.exceptions.IllegalMoveException;

public class Caller extends ChessPiece {

    protected Caller(Position position) {
        super(position);
    }

    public void move(Position newPosition) throws IllegalMoveException {

    }

    public static void main(String[] args) {
        try {
            new Bishop(null).move(null);
        } catch (IllegalMoveException e) {
            e.printStackTrace();
        } finally {
            System.out.println("move not allowed");
        }
    }
}
