/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.interfaces.series;

public class ByThree implements Series {
    private int value;

    public int next() {
        value += 3;
        return value;
    }
}
