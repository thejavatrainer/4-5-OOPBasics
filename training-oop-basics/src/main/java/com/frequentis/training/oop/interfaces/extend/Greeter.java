/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.interfaces.extend;

public class Greeter implements Bye {
    @Override
    public String sayHi() {
        return "Hi";
    }

    @Override
    public String sayBye() {
        return "Bye";
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHi());
        System.out.println(greeter.sayBye());
    }
}
