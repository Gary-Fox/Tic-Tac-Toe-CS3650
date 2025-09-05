import java.util.Scanner;


//I would probably seperate some of this into different classes/methods
// but for the sake of time I will leave it as is for now.
public class GameStart 
{
    void startGame()
    {
    Scanner scanner = new Scanner(System.in);
        GameBoard gb = new GameBoard();    
        RandomInput npc = new RandomInput();
        gb.initializeBoard();
        gb.displayBoard();
        int val = 2; //This makes the player 0 by default.

        for (int a = 0; a < 3; a++)
        {
            //prompting player's turn
        System.out.println("Where would you like to place your first piece?");
        
        // Getting user input
        System.out.println("Row:");
        int row = scanner.nextInt();
        row -= 1;
        System.out.println("Collum:");
        int col = scanner.nextInt();
        col -= 1;
        
        //Player's choice is set
        gb.setCell(row, col, val);
        gb.displayBoard();
        System.out.println();

        // Computer's turn
        npc.generateRandomMove(gb);
        gb.displayBoard();

        }

        scanner.close();
        
    }
}
