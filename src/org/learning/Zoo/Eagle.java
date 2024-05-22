package org.learning.Zoo;

public class Eagle extends Animal implements CanFly {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating kibble");
    }

    @Override
    public void makeNoise() {
        System.out.println("kree-ah");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
