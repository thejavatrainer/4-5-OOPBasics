/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.abstracts;

public class Main {
    public static void main(String[] args) {
        EmailSender textSender = new TextEmailSender();
        EmailSender htmlSender = new HtmlEmailSender();
        SmsSender smsSender = new SmsSender();

        String message = "some random text";

        textSender.send(message);   // Sending email: some random text
        htmlSender.send(message);   // Sending email: <html><body>some random text</body></html>

        smsSender.send(message);    // Sending SMS: some random text
    }
}
