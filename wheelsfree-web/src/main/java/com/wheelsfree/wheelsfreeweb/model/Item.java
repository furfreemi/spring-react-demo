package com.wheelsfree.wheelsfreeweb.model;

import java.math.BigDecimal;

public class Item {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;

    public Item(Long id, String name, String description, BigDecimal price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
}