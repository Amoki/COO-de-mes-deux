package model.MovePieceStrategy;

public class TourBehavior implements MovePieceStrategy {
    private static TourBehavior ourInstance = new TourBehavior();

    public static TourBehavior getInstance() {
        return ourInstance;
    }

    private TourBehavior() {
    }

    public boolean isMoveOk(int xInitial, int yInitial, int xFinal, int yFinal, boolean isCatchOk,
                            boolean isCastlingPossible, boolean premierCoup){
        boolean ret = false;

        if ((yFinal == yInitial) || (xFinal == xInitial)) {
            ret = true;
        }

        return ret;
    }
}
