package com.frequentis.training.oop;

import com.frequentis.training.oop.exceptions.IllegalMoveException;

/**
 * @autor mserban
 * Template for a ChessPiece
 */
public abstract class ChessPiece implements Movable {

    public static int tableSize = 8;

    protected final Position position;

    protected ChessPiece(Position position){
        this.position = position;
    }

    public abstract void move(Position newPosition) throws IllegalMoveException;

    public Position getPosition(){
        return this.position;
    }

    public static void main(String[] args) {
        System.out.println(tableSize);
        ChessPiece.tableSize = 9;
        System.out.println(tableSize);
        new Bishop(null).tableSize = 4;
        System.out.println(tableSize);
    }
}


