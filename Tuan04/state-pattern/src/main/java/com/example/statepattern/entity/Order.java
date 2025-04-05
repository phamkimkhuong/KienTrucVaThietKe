package com.example.statepattern.entity;

public class Order {
    private OrderState currentState;

    public Order() {
        // Trạng thái ban đầu
        this.currentState = new PendingState();
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void process() {
        currentState.processOrder(this);
    }

    public void cancel() {
        currentState.cancelOrder(this);
    }
}
