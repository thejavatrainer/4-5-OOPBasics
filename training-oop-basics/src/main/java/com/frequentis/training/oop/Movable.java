package com.frequentis.training.oop;

import com.frequentis.training.oop.exceptions.IllegalMoveException;

public interface Movable {

    public final static int SPEED = 100;

    void move(final Position position) throws IllegalMoveException;
}


