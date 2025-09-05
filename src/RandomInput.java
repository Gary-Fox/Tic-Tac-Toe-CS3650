
import java.util.Random;

public class RandomInput 
{
    // This class can be used to generate random moves for testing purposes
    // Split the row and col randomiztion into this class
    // Chhuck the rest of GenerateRandomMove into Gameboard
    void  generateRandomMove(GameBoard gb)
    {
        Random rand = new Random();
        //boolean stopRandom = false;

        //Generating computer move, will not loop if cell is occupied
        int row = rand.nextInt(3);
        int col = rand.nextInt(3);
        gb.setCell(row, col, 1);
            

        //An attempt to make the input loop until an empty cell is found.
       /*  while(stopRandom == false)
        {
             int row = rand.nextInt(3);
            int col = rand.nextInt(3);
           while( stopRandom = gb.setCell(row, col, stopRandom)
            gb.setCell(row, col, 1);
            
        } */
        
    }
}
