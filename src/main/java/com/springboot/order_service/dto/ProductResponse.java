package com.springboot.order_service.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductResponse {

    private long id;
    private String name;
    private Double price;
    private Integer quantity;
}
