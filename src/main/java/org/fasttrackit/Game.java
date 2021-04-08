package org.fasttrackit;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    Boxing boxer1 = new Boxing();
    Karate karate1 = new Karate();
    Judo judo1 = new Judo();

    Boxing boxer2 = new Boxing();
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
        fight(type1, type2);

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
            System.out.println("Boxing short color: ");
            boxer1.boxingshort= scanner.next();
            boxer1.life=20;
            boxer1.stamina=40;
            boxer1.punch=3;
            boxer1.kick=1;
            boxer1.takedown=2;
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
            System.out.println("Belt color: White - Green - Black");
            karate1.beltk = scanner.next();

            if(karate1.beltk == "White")
            {
                karate1.punch=1;
                karate1.kick=1;
                karate1.takedown=1;
                karate1.life=20;
                karate1.stamina=20;
            }
            if(karate1.beltk == "Green")
            {
                karate1.punch=2;
                karate1.kick=2;
                karate1.takedown=1;
                karate1.life=20;
                karate1.stamina=30;
            }
            if(karate1.beltk == "Black")
            {
                karate1.punch=3;
                karate1.kick=3;
                karate1.takedown=2;
                karate1.life=20;
                karate1.stamina=40;
            }
        }


        if (a == 3) {
            System.out.println("You chose the Judo fighter. Good luck!");
            System.out.println("Name: ");
            judo1.name = scanner.next();
            System.out.println("Age: ");
            judo1.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            judo1.weight = scanner.nextInt();
            System.out.println("Height(cm):  ");
            judo1.height = scanner.nextInt();
            System.out.println("Belt color: White - Blue - Black");
            judo1.beltj = scanner.next();
            if(judo1.beltj == "White")
            {
                judo1.punch=1;
                judo1.kick=1;
                judo1.takedown=1;
                judo1.life=20;
                judo1.stamina=20;
            }
            if(judo1.beltj == "Blue")
            {
                judo1.punch=2;
                judo1.kick=1;
                judo1.takedown=2;
                judo1.life=20;
                judo1.stamina=30;
            }
            if(judo1.beltj == "Black")
            {
                judo1.punch=3;
                judo1.kick=2;
                judo1.takedown=3;
                judo1.life=20;
                judo1.stamina=40;
            }

        }
        if (a < 1 || a > 4) {
            System.out.println("Invalid number entered!");
        }
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
            System.out.println("Boxing short color: ");
            boxer2.boxingshort= scanner.next();
            boxer2.life=20;
            boxer2.stamina=40;
            boxer2.punch=3;
            boxer2.kick=1;
            boxer2.takedown=2;
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
            System.out.println("Belt color: White - Green - Black");
            karate2.beltk = scanner.next();

            if(karate2.beltk == "White")
            {
                karate2.punch=1;
                karate2.kick=1;
                karate2.takedown=1;
                karate2.life=20;
                karate2.stamina=20;
            }
            if(karate2.beltk == "Green")
            {
                karate2.punch=2;
                karate2.kick=2;
                karate2.takedown=1;
                karate2.life=20;
                karate2.stamina=30;
            }
            if(karate2.beltk == "Black")
            {
                karate2.punch=3;
                karate2.kick=3;
                karate2.takedown=2;
                karate2.life=20;
                karate2.stamina=40;
            }
        }

        if (a == 3) {
            System.out.println("You chose the Judo fighter. Good luck!");
            System.out.println("Name: ");
            judo2.name = scanner.next();
            System.out.println("Age: ");
            judo2.age = scanner.nextInt();
            System.out.println("Weight(kg): ");
            judo2.weight = scanner.nextInt();
            System.out.println("Height(cm): ");
            judo2.height = scanner.nextInt();
            System.out.println("Belt color: White - Blue - Black");
            judo2.beltj = scanner.next();
            if(judo2.beltj == "White")
            {
                judo2.punch=1;
                judo2.kick=1;
                judo2.takedown=1;
                judo2.life=20;
                judo2.stamina=20;
            }
            if(judo2.beltj == "Blue")
            {
                judo2.punch=2;
                judo2.kick=1;
                judo2.takedown=2;
                judo2.life=20;
                judo2.stamina=30;
            }
            if(judo2.beltj == "Black")
            {
                judo2.punch=3;
                judo2.kick=2;
                judo2.takedown=3;
                judo2.life=20;
                judo2.stamina=40;
            }
        }
        if (a < 1 || a > 4) {
            System.out.println("Invalid number entered!");
        }
    }


    private void fight(int a, int b)  // fighting method
    {

        if(a==1 && b==1)
        {
            while ((boxer1.life != 0) && (boxer2.life != 0) && (boxer1.stamina!=0) && (boxer2.stamina!=0))
            {
                System.out.println("Life for " + boxer1.name + ": " + boxer1.life);
                System.out.println("Stamina for " + boxer1.name + ": " + boxer1.stamina);
                System.out.println(" ");
                System.out.println("Life for " + boxer2.name + ": " + boxer2.life);
                System.out.println("Stamina for " + boxer2.name + ": " + boxer2.stamina);
                System.out.println(" ");

                System.out.println("Move " + boxer1.name + ":");
                char move1= scanner.next().charAt(0);
                System.out.println("Move " + boxer2.name + ":");
                char move2= scanner.next().charAt(0);

                if (move1 == 'a' && move2 == 'a')
                {
                    boxer1.life = boxer1.life - boxer2.punch;
                    boxer2.life = boxer2.life - boxer1.punch;
                    boxer1.stamina= boxer1.stamina -2;
                    boxer2.stamina= boxer2.stamina -2;
                }
                if (move1 == 'a' && move2=='s')
                    {
                        boxer1.life = boxer1.life - boxer2.kick;
                        boxer2.life = boxer2.life - boxer1.punch;
                        boxer1.stamina= boxer1.stamina -2;
                        boxer2.stamina= boxer2.stamina -2;
                    }
                if (move1 == 'a' && move2=='d')
                    {
                        boxer1.life = boxer1.life - boxer2.takedown;
                        boxer2.life = boxer2.life - boxer1.punch;
                        boxer1.stamina= boxer1.stamina -2;
                        boxer2.stamina= boxer2.stamina -2;
                    }
                if (move1 == 'a' && move2=='x')
                {
                    boxer1.stamina--;
                    boxer2.stamina--;
                }
                if (move1 == 's' && move2=='a')
                {
                    boxer1.life = boxer1.life - boxer2.punch;
                    boxer2.life = boxer2.life - boxer1.kick;
                    boxer1.stamina= boxer1.stamina -2;
                    boxer2.stamina= boxer2.stamina -2;
                }
                if (move1 == 's' && move2=='s')
                {
                    boxer1.life = boxer1.life - boxer2.kick;
                    boxer2.life = boxer2.life - boxer1.kick;
                    boxer1.stamina= boxer1.stamina -2;
                    boxer2.stamina= boxer2.stamina -2;
                }
                if (move1 == 's' && move2=='d')
                {
                    boxer1.life = boxer1.life - boxer2.takedown;
                    boxer2.life = boxer2.life - boxer1.kick;
                    boxer1.stamina= boxer1.stamina -2;
                    boxer2.stamina= boxer2.stamina -2;
                }
                if (move1 == 's' && move2=='x')
                {
                    boxer1.stamina--;
                    boxer2.stamina--;
                }
                if (move1 == 'd' && move2=='a')
                {
                    boxer1.life = boxer1.life - boxer2.punch;
                    boxer2.life = boxer2.life - boxer1.takedown;
                    boxer1.stamina= boxer1.stamina -2;
                    boxer2.stamina= boxer2.stamina -2;
                }
                if (move1 == 'd' && move2=='s')
                {
                    boxer1.life = boxer1.life - boxer2.kick;
                    boxer2.life = boxer2.life - boxer1.takedown;
                    boxer1.stamina= boxer1.stamina -2;
                    boxer2.stamina= boxer2.stamina -2;
                }
                if (move1 == 'd' && move2=='d')
                {
                    boxer1.life = boxer1.life - boxer2.takedown;
                    boxer2.life = boxer2.life - boxer1.takedown;
                    boxer1.stamina= boxer1.stamina -2;
                    boxer2.stamina= boxer2.stamina -2;
                }
                if (move1 == 'd' && move2=='x')
                {
                    boxer1.stamina--;
                    boxer2.stamina--;
                }

            }

            if((boxer1.life==0 && boxer2.life ==0) || (boxer1.stamina==0 && boxer2.stamina==0))
                System.out.println(boxer1.name + " and " + boxer2.name + " are dead!!");
            else if(boxer1.life==0 || boxer1.stamina==0)
                System.out.println(boxer2.name + " wins the fight!!");
            else if(boxer2.life==0 || boxer2.stamina==0)
                System.out.println(boxer1.name + " wins the fight!!");
        }

        if(a==1 && b==2)
        {

        }

        if(a==1 && b==3)
        {

        }

        if(a==2 && b==1)
        {

        }

        if(a==2 && b==2)
        {

        }

        if(a==2 && b==3)
        {

        }

        if(a==3 && b==1)
        {

        }

        if(a==3 && b==2)
        {

        }

        if(a==3 && b==3)
        {

        }

    }
}
