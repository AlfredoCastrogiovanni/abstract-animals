package org.learning.bonus;

public class Creator {

    public static Playable create(String type) throws IllegalArgumentException {
        switch (type) {
            case "Playstation":
                return new Playstation();
            case "DVD player":
                return new DVDPlayer();
            default:
                throw new IllegalArgumentException("Enter a valid Device");
        }
    }
}
