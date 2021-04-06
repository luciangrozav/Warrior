package org.fasttrackit;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    Boxing boxer1 = new Boxing();
    Taekwondo taekwondo1 = new Taekwondo();
    Karate karate1 = new Karate();
    Judo judo1 = new Judo();

    Boxing boxer2 = new Boxing();
    Taekwondo taekwondo2 = new Taekwondo();
    Karate karate2 = new Karate();
    Judo judo2 = new Judo();

    public void start() {

        System.out.println("Player 1: Please choose your fighter:");
        int type1 = scanner.nextInt();
        initialise1(type1);
        System.out.println("Player 2: Please choose your fighter:");
        int type2 = scanner.nextInt();
        initialise2(type2);
        System.out.println("The moves are: 1-Punching, 2- Kicking, 3-Takedown, 4- Defence");
        System.out.println("Start fighting!");

    }

    private void initialise2(int a) {
        if (a == 1) {
            System.out.println("You chose the Boxer. Please keep in mind that punches are the strongest moves!");
            System.out.println("Age: ");
            boxer2.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            boxer2.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            boxer2.height = scanner.nextInt();
        }
        if (a == 2) {
            System.out.println("You chose the Karate fighter. Please keep in mind that punches and kicks are the strongest moves!");
            System.out.println("Age: ");
            karate2.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            karate2.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            karate2.height = scanner.nextInt();
        }
        if (a == 3) {
            System.out.println("You chose the Taekwondo fighter. Please keep in mind that kicks are the strongest moves!");
            System.out.println("Age: ");
            taekwondo2.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            taekwondo2.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            taekwondo2.height = scanner.nextInt();
        }
        if (a == 4) {
            System.out.println("You chose the Judo fighter. Please keep in mind that takedown is the strongest move!");
            System.out.println("Age: ");
            judo2.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            judo2.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            judo2.height = scanner.nextInt();
        }
        if (a < 1 || a > 4) {
            System.out.println("Invalid number entered!");
        }
    }

    private void initialise1(int a) {
        if (a == 1) {
            System.out.println("You chose the Boxer. Please keep in mind that punches are the strongest moves!");
            System.out.println("Age: ");
            boxer1.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            boxer1.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            boxer1.height = scanner.nextInt();
        }
        if (a == 2) {
            System.out.println("You chose the Karate fighter. Please keep in mind that punches and kicks are the strongest moves!");
            System.out.println("Age: ");
            karate1.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            karate1.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            karate1.height = scanner.nextInt();
        }
        if (a == 3) {
            System.out.println("You chose the Taekwondo fighter. Please keep in mind that kicks are the strongest moves!");
            System.out.println("Age: ");
            taekwondo1.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            taekwondo1.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            taekwondo1.height = scanner.nextInt();
        }
        if (a == 4) {
            System.out.println("You chose the Judo fighter. Please keep in mind that takedown is the strongest move!");
            System.out.println("Age: ");
            judo1.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            judo1.weight = scanner.nextInt();
            System.out.println("Height(cm):  ");
            judo1.height = scanner.nextInt();
        }
        if (a < 1 || a > 4) {
            System.out.println("Invalid number entered!");
        }
    }
}
