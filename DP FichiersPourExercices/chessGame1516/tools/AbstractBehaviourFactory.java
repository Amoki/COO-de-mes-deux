package tools;

import model.MovePieceStrategy.MovePieceStrategy;

public abstract class AbstractBehaviourFactory {

    public MovePieceStrategy getBehaviour(int x, int y, String pieceName) {
        return null;
    }

}
