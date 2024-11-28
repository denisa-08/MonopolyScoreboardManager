package org.example;

import java.util.ArrayList;
import java.util.List;

public class GameEventManager {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Player player) {
        for (Observer observer : observers) {
            observer.update(player);
        }
    }
}
