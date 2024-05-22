package org.learning.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal[] zoo = {new Dog("Max"), new Eagle("Gerry"), new Dolphin("Genny"), new Sparrow("Cip")};

        for (Animal animal : zoo) {
            System.out.println();
            System.out.println("I'm a " + animal.getClass().getSimpleName() + " and my name is " + animal.getName());
            animal.makeNoise();
            animal.eat();

            if (animal instanceof CanFly) {
                makeFly((CanFly)animal);
            }

            if (animal instanceof CanSwim) {
                makeSwim((CanSwim)animal);
            }
        }
    }

    public static void makeFly(CanFly animal) {
        animal.fly();
    }

    public static void makeSwim(CanSwim animal) {
        animal.swim();
    }
}
