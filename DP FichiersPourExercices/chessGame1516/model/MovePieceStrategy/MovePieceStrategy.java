package model.MovePieceStrategy;

public interface MovePieceStrategy {

    public boolean isMoveOk(int xInitial, int yInitial, int xFinal, int yFinal, boolean isCatchOk,
                            boolean isCastlingPossible, boolean premierCoup);
}
