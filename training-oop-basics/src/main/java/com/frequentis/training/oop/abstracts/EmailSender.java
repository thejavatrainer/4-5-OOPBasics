/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.abstracts;

public abstract class EmailSender extends MessageSender {
    @Override
    public void send(String message) {
        String formattedMessage = format(message);
        System.out.println("Sending email: " + formattedMessage);
    }
}
