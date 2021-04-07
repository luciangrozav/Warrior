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
        System.out.println("The moves are: Punch- 'a', Kick- 's', Takedown- 'd', Defence- 'x'");
        System.out.println("Start fighting!");
        fight();

    }

    private void initialise2(int a) {
        if (a == 1) {
            System.out.println("You chose the Boxer. Good luck!");
            System.out.println("Name: ");
            boxer2.name = scanner.next();
            System.out.println("Age: ");
            boxer2.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            boxer2.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            boxer2.height = scanner.nextInt();
            System.out.println("Gloves color: ");
            boxer2.gloves= scanner.next();
        }
        if (a == 2) {
            System.out.println("You chose the Karate fighter. Good luck!");
            System.out.println("Name: ");
            karate2.name = scanner.next();
            System.out.println("Age: ");
            karate2.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            karate2.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            karate2.height = scanner.nextInt();
            System.out.println("Karategi color:");
            karate2.karategi = scanner.next();
        }
        if (a == 3) {
            System.out.println("You chose the Taekwondo fighter. Good luck!");
            System.out.println("Name: ");
            taekwondo2.name = scanner.next();
            System.out.println("Age: ");
            taekwondo2.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            taekwondo2.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            taekwondo2.height = scanner.nextInt();
            System.out.println("Dobok color: ");
            taekwondo2.dobok = scanner.next();
        }
        if (a == 4) {
            System.out.println("You chose the Judo fighter. Good luck!");
            System.out.println("Name: ");
            judo2.name = scanner.next();
            System.out.println("Age: ");
            judo2.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            judo2.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            judo2.height = scanner.nextInt();
            System.out.println("Judogi color: ");
            judo2.judogi = scanner.next();
        }
        if (a < 1 || a > 4) {
            System.out.println("Invalid number entered!");
        }
    }

    private void initialise1(int a) {
        if (a == 1) {
            System.out.println("You chose the Boxer. Good luck!");
            System.out.println("Name: ");
            boxer1.name = scanner.next();
            System.out.println("Age: ");
            boxer1.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            boxer1.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            boxer1.height = scanner.nextInt();
            System.out.println("Gloves color: ");
            boxer1.gloves= scanner.next();
        }
        if (a == 2) {
            System.out.println("You chose the Karate fighter. Good luck!");
            System.out.println("Name: ");
            karate1.name = scanner.next();
            System.out.println("Age: ");
            karate1.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            karate1.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            karate1.height = scanner.nextInt();
            System.out.println("Karategi color:");
            karate1.karategi = scanner.next();
        }
        if (a == 3) {
            System.out.println("You chose the Taekwondo fighter. Good luck!");
            System.out.println("Name: ");
            taekwondo1.name = scanner.next();
            System.out.println("Age: ");
            taekwondo1.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            taekwondo1.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            taekwondo1.height = scanner.nextInt();
            System.out.println("Dobok color: ");
            taekwondo1.dobok = scanner.next();
        }
        if (a == 4) {
            System.out.println("You chose the Judo fighter. Good luck!");
            System.out.println("Name: ");
            judo1.name = scanner.next();
            System.out.println("Age: ");
            judo1.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            judo1.weight = scanner.nextInt();
            System.out.println("Height(cm):  ");
            judo1.height = scanner.nextInt();
            System.out.println("Judogi color: ");
            judo1.judogi = scanner.next();
        }
        if (a < 1 || a > 4) {
            System.out.println("Invalid number entered!");
        }
    }
    private void fight()
    {
        int life1 = 20;
        int life2 = 20;
        int stamina1=40;
        int stamina2=40;

        while ((life1 != 0) && (life2 != 0) && (stamina1!=0) && (stamina2!=0))
        {
            System.out.println("Life Player1: " + life1 + "  Stamina Player1: " + stamina1);
            System.out.println("Life Player2: " + life2 + "  Stamina Player2: " + stamina2);
            char move1= scanner.next().charAt(0);
            char move2= scanner.next().charAt(0);
            if ((move1 == 'a' || move1 == 's' || move1 == 'd') && (move2 == 'a' || move2 == 's' || move2 == 'd')) {
                life1 = life1 - 2;
                life2 = life2 - 2;
                stamina1=stamina1 -3;
                stamina2=stamina2-3;
            }
            if ((move1 == 'a' || move1 == 's' || move1 == 'd') && (move2 == 'x')) {
                {
                    life2--;
                stamina1=stamina1-3;
                stamina2=stamina2-1;
                }
            }
            if ((move1 == 'x') && (move2 == 'a' || move2 == 's' || move2 == 'd'))
            {
                life1--;
                stamina1=stamina1-1;
                stamina2=stamina2-3;
            }

        }
        if((life1==0 && life2 ==0) || (stamina1==0 &&stamina2==0))
            System.out.println("Both players are dead!!");
        else if(life1==0 || stamina1==0)
            System.out.println("Player2 wins the fight!!");
        else if (life2==0 || stamina2==0)
            System.out.println("Player1 wins the fight!!");
    }
}
