/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.interfaces.play;

import java.util.Random;

@SuppressWarnings("all")
/**
 * Method does not implement play() method so it must be declared abstract
 */
public abstract class AbstractPlayable implements Playable {
    public void startPlay(String fileName) {
        if (isPlayAllowed()) {
            play(fileName);
        }
    }

    private boolean isPlayAllowed() {
        boolean playAllowed = new Random().nextBoolean();
        System.out.println("Play is" + (playAllowed ? "" : " not") + " allowed");
        return playAllowed;
    }
}
