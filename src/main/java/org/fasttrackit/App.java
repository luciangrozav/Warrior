package org.fasttrackit;


public class App 
{
    public static void main( String[] args )

    {
        System.out.println( "Welcome to the Warrior Game!" );
        System.out.println("You can pick only one fighter:");
        System.out.println("1) Boxer");
        System.out.println("2) Karate fighter");
        System.out.println("3) Taekwondo fighter");
        System.out.println("4) Judo fighter");
        Game game = new Game();
        game.start();
    }
}
