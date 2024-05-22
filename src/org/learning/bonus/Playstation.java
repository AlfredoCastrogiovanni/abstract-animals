package org.learning.bonus;

public class Playstation implements Playable {

    @Override
    public void play() {
        System.out.println("I'm a " + this.getClass().getSimpleName() + " and I'm playing");
    }

    @Override
    public void stop() {
        System.out.println("I'm a " + this.getClass().getSimpleName() + " and I Stopped");
    }
}
