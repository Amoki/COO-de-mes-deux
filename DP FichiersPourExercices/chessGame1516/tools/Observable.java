package tools;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hugo on 29/04/2016.
 */
public abstract class Observable {
    private List<Observer> observers = new ArrayList();

    public void add(Observer o) {
        observers.add(o);
    };

    public void delete(Observer o) {
        observers.remove(o);
    };

    public void notify(Object obj) {
        for (Observer o : observers) {
            o.update(obj);
        }
    };


}
