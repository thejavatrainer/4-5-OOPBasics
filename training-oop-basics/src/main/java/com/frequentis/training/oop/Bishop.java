package com.frequentis.training.oop;

import com.frequentis.training.oop.exceptions.IllegalMoveException;

public final class Bishop extends ChessPiece {

    public Bishop(Position position) {
        super(position);
        System.out.println("a bishop is created at position: " + this.position);

    }

    public void move(Position newPosition) throws IllegalMoveException {
        if(!areOnTheSameDiagonal(this.position, newPosition)) {
            throw new IllegalMoveException("Bishop can only move on diagonals!");
        }
        move2(newPosition);
    }

    private boolean areOnTheSameDiagonal(Position position, Position newPosition) {
        return false;
    }

    public Position move2(Position position){
        return getPosition();
    }


    public void move(int xPos, int yPos){
    }

    @Override
    public void finalize(){
        System.out.println("this object is distroyed");
    }




}


