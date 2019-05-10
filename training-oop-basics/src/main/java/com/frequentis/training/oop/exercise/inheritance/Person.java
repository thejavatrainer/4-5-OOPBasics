/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.exercise.inheritance;

public class Person {
    private String name;

    public Person(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isEntryAllowed() {
        return false;
    }
}
