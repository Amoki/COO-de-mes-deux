package tools;

import model.MovePieceStrategy.MovePieceStrategy;

public class StormBehaviourFactory extends AbstractBehaviourFactory{

    private static StormBehaviourFactory ourInstance = new StormBehaviourFactory();

    public static StormBehaviourFactory getInstance() {
        return ourInstance;
    }

    private StormBehaviourFactory(){

    }

    @Override
    public MovePieceStrategy getBehaviour(int x, int y, String pieceName) {
        if(x == 0 || x == 7) {
            try {
                return ((MovePieceStrategy)Introspection.invokeStatic("model.MovePieceStrategy.TourBehavior", null, "getInstance"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(x == 1 || x == 6) {
            try {
                return ((MovePieceStrategy)Introspection.invokeStatic("model.MovePieceStrategy.CavalierBehavior", null, "getInstance"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(x == 2 || x == 5) {
            try {
                return ((MovePieceStrategy)Introspection.invokeStatic("model.MovePieceStrategy.FouBehavior", null, "getInstance"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                return ((MovePieceStrategy)Introspection.invokeStatic("model.MovePieceStrategy."+pieceName+"Behavior", null, "getInstance"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
