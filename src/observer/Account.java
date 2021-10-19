package observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Observer> observers = new ArrayList<>();
    public void add(Observer observer){
        observers.add(observer);
    }
    public void delete(Observer observer){
        observers.remove(observer);
    }
    public void notification(String mess){
        for (Observer o: observers
             ) {
            o.update(mess);
        }
    }
}
