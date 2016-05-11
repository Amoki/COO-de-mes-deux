package model.MovePieceStrategy;

public class RoiBehavior implements MovePieceStrategy{
    private static RoiBehavior ourInstance = new RoiBehavior();

    public static RoiBehavior getInstance() {
        return ourInstance;
    }

    private RoiBehavior() {
    }

    public boolean isMoveOk(int xInitial, int yInitial, int xFinal, int yFinal, boolean isCatchOk,
                            boolean isCastlingPossible, boolean premierCoup){
        boolean ret = false;

        if ((Math.abs(yFinal - yInitial) <= 1)
                && (Math.abs(xFinal - xInitial) <= 1)) {
            ret = true;
        }


        return ret;
    }
}
