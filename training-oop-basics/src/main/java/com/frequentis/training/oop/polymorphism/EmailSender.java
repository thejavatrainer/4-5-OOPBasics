/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.polymorphism;

public class EmailSender extends MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
