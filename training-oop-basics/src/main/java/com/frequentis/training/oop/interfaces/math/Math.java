/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.interfaces.math;

public class Math {
    public static void main(String[] args) {
        System.out.println(execute(Operation.ADD, 2, 3));
        System.out.println(execute(Operation.MUL, 2, 3));
        System.out.println(execute(Operation.DIV, 2, 3));
        System.out.println(execute(Operation.SUB, 2, 3));
    }

    private static double execute(String operation, double op1, double op2) {
        switch (operation) {
            case Operation.ADD:
                return op1 + op2;
            case Operation.SUB:
                return op1 - op2;
            case Operation.MUL:
                return op1 * op2;
            case Operation.DIV:
                return op1 / op2;
        }

        return Double.NaN;
    }
}
