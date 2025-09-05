



public class GameBoard
{
    int[][] array = new int[3][3];
    char[][] displayArray = new char[3][3];
    
    //Sets all values in the array to 0
 void initializeBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                array[i][j] = 0;
                displayArray[i][j] =  ' '; // Empty character
            }
        }
    }

    //Checks input for validity, if yes then the move is made.
    void setCell(int row, int col, int value)
    {
        if(array[row][col] != 0)
        {
            System.out.println("Cell already occupied. Choose another cell.");
        }
        else
        {
            array[row][col] = value;
        }
        
    }

    //Does not currently work, inheritance/polymorphism issue.
       public boolean setCell(int row, int col, boolean stopRandom)
    {
         if(array[row][col] != 0)
        {
           // stopRandom = false;
            return stopRandom;
        }
        else
        {
            //this.setCell(row, col, 1);
            stopRandom = !stopRandom;
            return stopRandom;
        }
        
    }


    /* May be of interest? Or encapsulation? */
    /* protected int[][] getArray() {
        return array;
    }

    protected char[][] getDisplayArray() {
        return displayArray;
    }
    */
 
    //Printing out the board to user's convience
    public String printRow(int row)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        arrayConvert();
        for (int j = 0; j < 3; j++)
        {
            sb.append(" ").append(displayArray[row][j]).append(" |");
        }
        return sb.toString();
    }

    //This may be redundant, or at least eaily replacable by enum
    void arrayConvert()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                switch (array[i][j]) {
                    case 0:
                        displayArray[i][j] = ' '; // Use a space character instead of ''
                        break;
                    case 1:
                        displayArray[i][j] = 'X';
                        break;
                    case 2:
                        displayArray[i][j] = 'O';
                        break;
                    default:
                        break;
                }
            }
        }
    }

    void displayBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            //for (int j = 0; j < 3; j++)
            //{
                System.out.print(printRow(i));
            //}
            System.out.println();
        }
    }
}