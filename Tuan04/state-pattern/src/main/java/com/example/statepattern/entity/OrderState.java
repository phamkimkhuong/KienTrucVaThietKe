package com.example.statepattern.entity;

public interface OrderState {
        void processOrder(Order order);
        void cancelOrder(Order order);
}
