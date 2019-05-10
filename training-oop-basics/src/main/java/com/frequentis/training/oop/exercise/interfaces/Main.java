/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.exercise.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
        };

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " says: " + animal.speak());
        }
    }
}
