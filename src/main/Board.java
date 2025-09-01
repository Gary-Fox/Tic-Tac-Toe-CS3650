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
    
    public Boolean isFull() {
        //
        return false;
    }
    
    public Mark getCell (int r, int c) {
        //
        return 0;
    }
    
    public void reset() {
        //
    }

    public place(Move mv) {
        //throws IllegalArgumentException if invalid
        return 0;
    }
    
}