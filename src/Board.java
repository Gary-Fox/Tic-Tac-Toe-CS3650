// src/Board.java
public class Board {
    private char[][] grid = new char[3][3];

    public Board() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                grid[i][j] = ' ';
    }

    public boolean placeMark(int row, int col, char mark) {
        if (row < 0 || row > 2 || col < 0 || col > 2 || grid[row][col] != ' ')
            return false;
        grid[row][col] = mark;
        return true;
    }

    public boolean checkWin(char mark) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == mark && grid[i][1] == mark && grid[i][2] == mark) return true;
            if (grid[0][i] == mark && grid[1][i] == mark && grid[2][i] == mark) return true;
        }
    }
}
