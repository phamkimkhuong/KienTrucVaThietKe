package com.example.statepattern.entity;

public class ProcessingState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Chuyển đơn hàng sang trạng thái VẬN CHUYỂN");
        order.setState(new ShippingState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Không thể hủy đơn hàng đang xử lý");
    }
}
