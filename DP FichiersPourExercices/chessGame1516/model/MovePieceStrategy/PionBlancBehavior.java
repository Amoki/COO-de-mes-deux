package model.MovePieceStrategy;

import model.Couleur;

import static com.sun.tools.javac.jvm.ByteCodes.ret;

public class PionBlancBehavior extends PionBehavior{
    private static PionBlancBehavior ourInstance = new PionBlancBehavior();

    public static PionBlancBehavior getInstance() {
        return ourInstance;
    }

    private PionBlancBehavior() {
    }


    public boolean isMoveVerticalOk(int yInitial, int yFinal) {
        return (yFinal - yInitial) < 0;
    }

    public boolean isMoveDiagonalOk(int xInitial, int yInitial, int xFinal, int yFinal) {
        Boolean ret = false;
        if ((yFinal == yInitial-1 && xFinal == xInitial+1)
                || (yFinal == yInitial-1 && xFinal == xInitial-1)) {
            ret = true;
        }
        return ret;
    }
}
