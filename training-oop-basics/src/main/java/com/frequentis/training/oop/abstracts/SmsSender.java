/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.abstracts;

public class SmsSender extends MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }

    @Override
    public String format(String message) {
        return null;
    }
}
