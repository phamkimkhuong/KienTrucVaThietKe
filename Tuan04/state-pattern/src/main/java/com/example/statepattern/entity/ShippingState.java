package com.example.statepattern.entity;

public class ShippingState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Chuyển đơn hàng sang trạng thái GIAO HÀNG");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Không thể hủy đơn hàng đang vận chuyển");
    }
}
