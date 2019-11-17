package com.wheelsfree.wheelsfreebff.controller;

import com.wheelsfree.wheelsfreebff.response.ItemsResponse;
import com.wheelsfree.wheelsfreebff.service.ItemService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public ItemsResponse getAllAvailableItems() {
        return new ItemsResponse(itemService.getInStockItems());
    }
}
