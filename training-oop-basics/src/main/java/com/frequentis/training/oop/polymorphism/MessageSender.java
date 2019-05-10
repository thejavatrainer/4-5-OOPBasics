/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.polymorphism;

public class MessageSender {
    public void send(String message) {
        System.out.println("Sending: " + message);
    }

    public static void main(String[] args) {
        String message = "some message";

        MessageSender[] senders = new MessageSender[] {
                new MessageSender(),
                new SmsSender(),
                new EmailSender()
        };

        for (MessageSender sender : senders) {
            sender.send(message);
        }
    }
}
