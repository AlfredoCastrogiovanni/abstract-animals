package org.learning.Zoo;

public class Sparrow extends Animal implements CanFly {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a mouse");
    }

    @Override
    public void makeNoise() {
        System.out.println("cip cip");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
