package com.example.observerpattern.entity;

import src.main.java.com.example.observerpattern.entity.Observer;
import src.main.java.com.example.observerpattern.entity.Subject;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Observer {
    private String name;
    private final List<Observer> observers;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void update() {

    }

    @Override
    public void setSubject(Subject subject) {

    }

    @Override
    public void registerObserver(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        if (!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        List<Observer> copy = null;
        if(!changed) return;
        copy = new ArrayList<>(this.observers);
        this.changed = false;
    }

    @Override
    public Object update(Observer observer) {
        return null;
    }
}
