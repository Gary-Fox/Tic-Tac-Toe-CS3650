// src/HumanPlayer.java
import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(char mark) {
        super(mark);
    }

    @Override
    public void makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter row and column (0-2) for " + mark + ": ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            valid = board.placeMark(row, col, mark);
            if (!valid) System.out.println("Invalid move, try again.");
        }
    }
}
