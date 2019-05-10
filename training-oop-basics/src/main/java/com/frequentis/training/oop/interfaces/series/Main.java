/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.interfaces.series;

public class Main {
    private static int nextValue(Series series) {
        return series.next();
    }

    public static void main(String[] args) {
        ByThree byThree = new ByThree();
        ByTwo byTwo = new ByTwo();

        System.out.println(nextValue(byThree));     // 3
        System.out.println(nextValue(byTwo));       // 2
        System.out.println(nextValue(byTwo));       // 4
        System.out.println(nextValue(byThree));     // 6
    }
}
