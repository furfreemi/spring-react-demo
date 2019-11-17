package com.wheelsfree.wheelsfreebff.model;

import java.math.BigDecimal;

public class Item {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long quantity;
    private String imageUrl;

    public Item(Integer id, String name, String description, BigDecimal price, Long quantity, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}