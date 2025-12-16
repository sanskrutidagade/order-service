package com.springboot.order_service.service;

import com.springboot.order_service.entity.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
@Component
public interface OrderService {

    Order createOrder(Long productId, Integer quantity);
    Order getOrderById(Long orderId);
    List<Order> getAllOrders();
}
