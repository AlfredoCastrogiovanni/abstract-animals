package org.learning.Zoo;

public class Dolphin extends Animal implements canSwim {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a fish");
    }

    @Override
    public void makeNoise() {
        System.out.println("clic-clac");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming...");
    }
}
