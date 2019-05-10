/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.frequentis.training.oop.interfaces.play;

public class PlayableImpl extends AbstractPlayable {
    @Override
    public void play(final String fileName) {
        System.out.println("Playing " + fileName);
    }

    public static void main(String[] args) {
        AbstractPlayable playable = new PlayableImpl();
        playable.startPlay("abc");
    }
}
