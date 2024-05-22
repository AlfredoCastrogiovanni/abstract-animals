package org.learning.Zoo;

public class Dog extends Animal implements canSwim {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating kibble");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bau Bau");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming...");
    }
}
