package com.springboot.order_service.controller;


import com.springboot.order_service.entity.Order;
import com.springboot.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }
    @PostMapping
    public Order createOrder(@RequestParam Long productId, @RequestParam int quantity){
        return orderService.createOrder(productId,quantity);
    }

    @GetMapping
    public Order getOrder(@PathVariable Long id){
        return orderService.getOrderById(id);
    }

    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }


}
