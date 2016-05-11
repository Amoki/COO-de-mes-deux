package model.MovePieceStrategy;

public class FouBehavior implements MovePieceStrategy{
    private static FouBehavior ourInstance = new FouBehavior();

    public static FouBehavior getInstance() {
        return ourInstance;
    }

    private FouBehavior() {
    }

    public boolean isMoveOk(int xInitial, int yInitial, int xFinal, int yFinal, boolean isCatchOk,
                            boolean isCastlingPossible, boolean premierCoup){
        boolean ret = false;

        if (Math.abs(yFinal - yInitial) == Math.abs(xFinal - xInitial)) {
            ret  = true;
        }

        return ret;
    }
}
