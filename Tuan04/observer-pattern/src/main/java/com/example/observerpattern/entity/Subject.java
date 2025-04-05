package src.main.java.com.example.observerpattern.entity;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    // notify all observers when the state of the subject changes
    void notifyObservers();

    Object update(Observer observer);
}

