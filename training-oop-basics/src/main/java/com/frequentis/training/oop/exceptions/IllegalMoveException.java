package com.frequentis.training.oop.exceptions;

public class IllegalMoveException extends Exception {


    public IllegalMoveException(String s) {
        super(s);
    }

    public IllegalMoveException(String message, Throwable cause) {
        super(message, cause);
    }
}


