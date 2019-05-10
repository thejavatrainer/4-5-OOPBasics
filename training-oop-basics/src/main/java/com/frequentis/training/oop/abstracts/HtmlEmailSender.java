/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.abstracts;

public class HtmlEmailSender extends EmailSender {
    @Override
    public String format(final String message) {
        return "<html><body>" + message + "</body></html>";
    }
}
