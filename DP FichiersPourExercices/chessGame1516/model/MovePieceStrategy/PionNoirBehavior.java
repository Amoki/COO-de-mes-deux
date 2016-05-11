package model.MovePieceStrategy;

public class PionNoirBehavior extends PionBehavior{
    private static PionNoirBehavior ourInstance = new PionNoirBehavior();

    public static PionNoirBehavior getInstance() {
        return ourInstance;
    }

    private PionNoirBehavior() {
    }

    public boolean isMoveVerticalOk(int yInitial, int yFinal) {
        return (yFinal - yInitial) > 0;
    }

    public boolean isMoveDiagonalOk(int xInitial, int yInitial, int xFinal, int yFinal) {
        Boolean ret = false;
        if ((yFinal == yInitial+1 && xFinal == xInitial+1)
                || (yFinal == yInitial+1 && xFinal == xFinal-1)) {
            ret = true;
        }
        return ret;
    }
}
