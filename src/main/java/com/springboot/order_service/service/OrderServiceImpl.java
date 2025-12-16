package com.springboot.order_service.service;

import com.springboot.order_service.dto.ProductResponse;
import com.springboot.order_service.entity.Order;
import com.springboot.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
public class OrderServiceImpl implements OrderService{
    @Autowired
    private final OrderRepository repository;
    @Autowired
    private final RestTemplate restTemplate;

    public OrderServiceImpl(OrderRepository repository, RestTemplate restTemplate){
        this.repository=repository;
        this.restTemplate=restTemplate;
    }

    @Override
    public Order createOrder(Long productId, Integer quantity) {
        ProductResponse product = restTemplate.getForObject("http://localhost:8080/api/products/" + productId, ProductResponse.class);

        Double total = product.getPrice() * quantity;

        Order order = Order.builder()
                .productId(productId)
                .quantity(quantity)
                .totalAmount(total)
                .status("Created")
                .build();
        return repository.save(order);


    }

    @Override
    public Order getOrderById(Long orderId) {
        return repository.findById(orderId).orElse(null);
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}
