package org.learning.Zoo;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println("Zzzz");
    }

    public abstract void makeNoise();

    public abstract void eat();
}
