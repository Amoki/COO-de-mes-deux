package tools;

import model.MovePieceStrategy.MovePieceStrategy;

public class ClassicBehaviourFactory extends AbstractBehaviourFactory {

    private static ClassicBehaviourFactory ourInstance = new ClassicBehaviourFactory();

    public static ClassicBehaviourFactory getInstance() {
        return ourInstance;
    }

    private ClassicBehaviourFactory(){

    }

    @Override
    public MovePieceStrategy getBehaviour(int x, int y, String pieceName) {
        try {
            return ((MovePieceStrategy)Introspection.invokeStatic("model.MovePieceStrategy."+pieceName+"Behavior", null, "getInstance"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
