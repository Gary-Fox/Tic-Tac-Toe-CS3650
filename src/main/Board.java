public class Board {
    private final int size = 3;

    private final Mark[][] grid; //initalized to empty

    public Board(int rows, int cols) {
        grid = new Mark[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(grid[i], Mark.EMPTY);
        }
    }
    
    public Optional<Mark>winner() {
        // checks rows, cols, diagonals
        return 0;
    }
    
    public Boolean isFull() 
    {
        //Establishing Dummy Variable
        int z = 0;

        //Counting the number of X's and O's in the grid.
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == Mark.X) 
                {
                    z++;
                }
                if (grid[i][j] == Mark.O) 
                {
                    z++;
                }
            }
        }

        //If the number of X's and O's is equal to the number of cells
        //The board is full. Otherwise there's space.
        if (z == i*j)
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
    
    public Mark getCell (int r, int c) {
        
        //Currently prints and returns the required cell.
        //Not sure if this is what this is for.
        System.out.println(grid[r][c]);
        return grid[r][c];
    }
    
    public void reset() 
    {
        //Filling all the cells with EMPTY mark.
        for (int i = 0; i < rows; i++) 
        {
            Arrays.fill(grid[i], Mark.EMPTY);
        }
        
    }

    public place(Move mv) {
        //throws IllegalArgumentException if invalid
        return 0;
    }
    
}