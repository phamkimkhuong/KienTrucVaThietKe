package com.example.statepattern;

import com.example.statepattern.entity.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatePatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatePatternApplication.class, args);
        Order order = new Order();

        // Chuyển trạng thái
        order.process();  // Pending -> Processing
        order.process();  // Processing -> Shipping
        order.process();  // Shipping -> Delivered
    }
}
