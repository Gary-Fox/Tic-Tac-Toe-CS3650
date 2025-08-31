/*Created by Gary Carrasco and

 */


// src/Main.java
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player p1 = new HumanPlayer('X');
        Player p2 = new ComputerPlayer('O');
        Player current = p1;

        while (true) {
            board.printBoard();
            current.makeMove(board);
            if (board.checkWin(current.getMark())) {
                board.printBoard();
                System.out.println(current.getMark() + " wins!");
                break;
            }
            if (board.isFull()) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }
            current = (current == p1) ? p2 : p1;
        }
    }
}