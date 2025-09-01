// src/ComputerPlayer.java
import java.util.Random;

public class ComputerPlayer extends Player {
    public ComputerPlayer(char mark) {
        super(mark);
    }

    @Override
    public void makeMove(Board board)
    {
        Random rand = new Random();
        boolean valid = false;
        while (!valid)
        {
            int row = rand.nextInt(3);
            int col = rand.nextInt(3);
            valid = board.placeMark(row, col, mark);
        }
        System.out.println("Computer placed " + mark + " at (" + row + ", " + col + ")");

    }
}
