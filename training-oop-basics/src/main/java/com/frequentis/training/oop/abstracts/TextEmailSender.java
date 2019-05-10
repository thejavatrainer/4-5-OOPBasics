/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.abstracts;

public class TextEmailSender extends EmailSender {
    @Override
    public String format(final String message) {
        return message;
    }
}
