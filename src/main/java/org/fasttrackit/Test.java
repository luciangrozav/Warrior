package org.fasttrackit;

import java.util.Scanner;

public class Test {

    String name;
    int kick;
    int life;



    public static void main(String[] args) {

        Test test1 = new Test();
        Test test2 = new Test();
        Scanner scanner = new Scanner(System.in);

        test1.kick=5;
        test2.kick=3;
        test1.name = "Muhammad Ali";

        test1.life=20;
        test2.life=20;

       while(test2.life>0)
       {
           System.out.println("Life= " + test2.life);
           char move1= scanner.next().charAt(0);
           if(move1 =='a')
               test2.life= test2.life - test1.kick;
       }
       if(test2.life==0)
           System.out.println(test1.name + " WINS!!");

    }


}
