package org.example;

// Main.java
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe.");

        //Game loop
        do
        {
            //Asks user for preffered game type
            System.out.println("Which game would you like: Human vs AI (0) or Human vs Human (1)?");
            System.out.println("Enter any other character to exit.");
            int gameType = in.nextInt();

            //Starts the game based on user input
            switch (gameType)
            {
                case 0 ->
                    {

                        Player human = new HumanPlayer("You", Mark.X, in);
                        Player ai = new AIPlayer("Computer", Mark.O, new RandomStrategy());
                        Game game = new Game(human, ai);
                        game.play();
                    }
                case 1 ->
                    {

                        Player P1 = new HumanPlayer("P1", Mark.X, in);
                        Player P2 = new HumanPlayer("P2", Mark.O, in);
                        Game game = new Game(P1, P2);
                        game.play();
                        //System.out.println("Want to play again? (y/n)");
                    }
                default ->
                    {
                    System.out.println("Invalid choice, exiting.");
                    System.exit(0);
                    }
            }
            System.out.println("Want to play again? (y/n)");
        }
        while (in.next().equalsIgnoreCase("y"));
        
            System.exit(0);
    }
}


