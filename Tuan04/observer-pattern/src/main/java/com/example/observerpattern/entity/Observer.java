package src.main.java.com.example.observerpattern.entity;

public interface Observer {
    void update();

    void setSubject(Subject subject);

    void registerObserver(Observer obj);

    void removeObserver(Observer observer);

    void notifyObservers();

    Object update(Observer observer);
}
