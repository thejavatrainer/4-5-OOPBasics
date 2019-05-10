/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.interfaces.series;

public class ByTwo implements Series {
    private int value = 0;

    public int next() {
        value += 2;
        return value;
    }
}
