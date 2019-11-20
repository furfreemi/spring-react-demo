package com.wheelsfree.controller;

import com.wheelsfree.model.Item;
import com.wheelsfree.response.ItemsResponse;
import com.wheelsfree.service.ItemService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8081"})
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public ItemsResponse getAllAvailableItems() {
        //return new ItemsResponse(itemService.getInStockItems());
        List<Item> items = Arrays.asList(
                new Item(1, "Fancy Drone", "Good base model drone.", BigDecimal.valueOf(100.25), 50L, "https://images.pexels.com/photos/336232/pexels-photo-336232.jpeg?w=750"),
                new Item(2, "Super Fancy Drone", "The best drone money can buy.", BigDecimal.valueOf(229.99), 10L, "https://images.pexels.com/photos/442587/pexels-photo-442587.jpeg?w=750"),
                new Item(3, "Fancier Drone", "Starting to become an advanced drone user.", BigDecimal.valueOf(159.85), 25L, "https://images.pexels.com/photos/2100075/pexels-photo-2100075.jpeg?w=750")

        );

        return new ItemsResponse(items);
    }
}
