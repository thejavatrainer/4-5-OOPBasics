/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.inheritance.ctors;

public class SubClass extends SuperClass {
    public SubClass(String message) {
        // since super class has no default constructor
        // we must call constructor with parameters from super class
        super(message);
    }
}
