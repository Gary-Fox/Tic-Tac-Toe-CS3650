package org.example;
import java.util.Arrays;

public class Board
{
    private final Mark[][] grid = new Mark[3][3];
    private int moves = 0;

    public Board()
    {
        //Initalizes the board
        for (Mark[] row : grid) Arrays.fill(row, Mark.EMPTY);
    }

    public boolean isEmpty(int r, int c)
    {
        return grid[r][c] == Mark.EMPTY;
    }
    public boolean place(int r, int c, Mark mark)
    {
        // Given a row and column, places player mark if spot is empty
        if (!isEmpty(r, c)) return false;
        grid[r][c] = mark;
        moves++;
        return true;
    }
    public boolean isFull()
    {
        // Full if all 9 spots are filled
        return moves == 9;
    }

    public Mark winner()
    {
        Mark[] temp = new Mark[]{grid[0][0], grid[0][1], grid[0][2], grid[1][0], grid[1][1], grid[1][2],
                                 grid[2][0], grid[2][1], grid[2][2]};

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                // For any combinations involving the four corners :
                // Both i and j should be even indices, but not equal to index 4
                if (i != j && (i % 2 == 0) && (j % 2 == 0) && (i != 4) && (j != 4) && temp[i] == temp[j]) {

                    // Index between i and j should not equal i or j (rounding issues)
                    if(((i+j)/2) != i && ((i+j)/2) != j && line(temp[i], temp[((i+j)/2)], temp[j])) {
                        return temp[i];
                    }
                }
                // For any combinations NOT involving the four corners :
                // Both i and j should be odd, index between them should be 4
                if (i != j && (i % 2 == 1) && (j % 2 == 1) && temp[i] == temp[j]) {

                    // Index between i and j should equal 4 -- calculation for integer rounding purposes
                    if(((i+j)/2) == 4 && line(temp[i], temp[4], temp[j])) {
                        return temp[i];
                    }
                }
            }
        }
        
        //Old code :
        /*for (int i = 0; i < 3; i++)
        {
            if (line(grid[i][0], grid[i][1], grid[i][2])) return grid[i][0];
            if (line(grid[0][i], grid[1][i], grid[2][i])) return grid[0][i];
        }
        if (line(grid[0][0], grid[1][1], grid[2][2])) return grid[0][0];
        if (line(grid[0][2], grid[1][1], grid[2][0])) return grid[0][2];*/
        
        return Mark.EMPTY; // Return EMPTY if no winner
    }

    private boolean line(Mark a, Mark b, Mark c)
    {
        // Returns mark if three in a row (not empty)
        return a != Mark.EMPTY && a == b && b == c;
    }

    public void print()
    {
        System.out.println();
        for (int r = 0; r < 3; r++)
        {
            System.out.printf(" %s | %s | %s %n", grid[r][0], grid[r][1],
                    grid[r][2]);
            if (r < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }
}
