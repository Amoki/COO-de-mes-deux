package model.MovePieceStrategy;

import model.Couleur;

public abstract class PionBehavior implements MovePieceStrategy{


    public boolean isMoveOk(int xInitial, int yInitial, int xFinal, int yFinal, boolean isCatchOk,
                            boolean isCastlingPossible, boolean premierCoup) {

        boolean ret = false;

        // Déplacement vertical
        if (!isCatchOk && !isCastlingPossible){

            if ((xFinal == xInitial)
                    && (Math.abs(yFinal - yInitial) <= 1 ||
                    (Math.abs(yFinal - yInitial) <= 2 && premierCoup))) {

                ret = isMoveVerticalOk(yInitial, yFinal);
            }
        }
        // Déplacement diagonal
        else {
            ret = isMoveDiagonalOk(xInitial, yInitial, xFinal, yFinal);
        }

        return ret;

    }

    protected abstract boolean isMoveVerticalOk(int yInitial, int yFinal);
    protected abstract boolean isMoveDiagonalOk(int xInitial, int yInitial, int xFinal, int yFinal);

}
