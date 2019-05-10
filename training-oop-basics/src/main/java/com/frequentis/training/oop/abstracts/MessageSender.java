/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.abstracts;

public abstract class MessageSender {
    public abstract void send(String message);

    public abstract String format(String message);
}
