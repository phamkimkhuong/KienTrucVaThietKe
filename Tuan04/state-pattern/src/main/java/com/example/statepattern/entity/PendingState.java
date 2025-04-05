package com.example.statepattern.entity;

public class PendingState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Chuyển đơn hàng sang trạng thái XỬ LÝ");
        order.setState(new ProcessingState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Hủy đơn hàng");
    }
}
