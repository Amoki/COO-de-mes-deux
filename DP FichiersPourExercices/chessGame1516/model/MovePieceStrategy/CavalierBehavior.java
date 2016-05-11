package model.MovePieceStrategy;

public class CavalierBehavior implements MovePieceStrategy {
    private static CavalierBehavior ourInstance = new CavalierBehavior();

    public static CavalierBehavior getInstance() {
        return ourInstance;
    }

    private CavalierBehavior() {
    }

    public boolean isMoveOk(int xInitial, int yInitial, int xFinal, int yFinal, boolean isCatchOk,
                            boolean isCastlingPossible, boolean premierCoup){

        boolean ret = false;

        if ((Math.abs(xFinal - xInitial) + Math.abs(yFinal - yInitial)) == 3) {

            if ((Math.abs(xFinal - xInitial)<3) && (Math.abs(yFinal - yInitial)<3)) {
                ret  = true;
            }
        }

        return ret;
    }
}
