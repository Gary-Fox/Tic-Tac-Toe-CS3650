package org.example;

// AIPlayer.java
public class AIPlayer extends Player
{
    private final MoveStrategy strategy;
    public AIPlayer(String name, Mark mark, MoveStrategy strategy)
    {
        super(name, mark);
        this.strategy = strategy;
    }
    @Override
    public int[] chooseMove(Board board) {
        System.out.println("AI (O) is making a move...");
        return strategy.pickMove(board, mark);
    }
}
