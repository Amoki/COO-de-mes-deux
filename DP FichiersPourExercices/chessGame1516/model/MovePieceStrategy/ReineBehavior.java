package model.MovePieceStrategy;

import static com.sun.tools.doclint.Entity.xi;

public class ReineBehavior implements MovePieceStrategy{
    private static ReineBehavior ourInstance = new ReineBehavior();

    public static ReineBehavior getInstance() {
        return ourInstance;
    }

    private ReineBehavior() {
    }

    public boolean isMoveOk(int xInitial, int yInitial, int xFinal, int yFinal, boolean isCatchOk,
                            boolean isCastlingPossible, boolean premierCoup){
        boolean ret = false;

        if (Math.abs(yFinal - yInitial) == Math.abs(xFinal - xInitial)
                || ((yFinal == yInitial) || (xFinal == xInitial))) {
            ret =  true;
        }

        return ret;
    }
}
