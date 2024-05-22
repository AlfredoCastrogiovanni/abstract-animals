package org.learning.bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Playable device = null;

        System.out.println("Choose one device: ");
        System.out.println();
        System.out.println("1. Playstation");
        System.out.println("2. DVD Player");
        System.out.println();
        char choice = scanner.nextLine().charAt(0);

        switch (choice) {
            case '1':
                device = Creator.create("Playstation");
                break;
            case '2':
                device = Creator.create("DVD Player");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        while (true) {
            System.out.println();
            System.out.println("-------------");
            System.out.println("1. Play");
            System.out.println("2. Stop");
            System.out.println("3. Exit");
            System.out.println();

            choice = scanner.nextLine().charAt(0);
            System.out.println();

            switch (choice) {
                case '1':
                    device.play();
                    break;
                case '2':
                    device.stop();
                    break;
                case '3':
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
