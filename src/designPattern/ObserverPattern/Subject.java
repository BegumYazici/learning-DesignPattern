package designPattern.ObserverPattern;

// This interface handles adding, deleting and updating
// all observers

import java.util.Observer;

public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();

}