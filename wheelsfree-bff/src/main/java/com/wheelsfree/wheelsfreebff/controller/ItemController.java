package com.wheelsfree.wheelsfreebff.controller;

import com.wheelsfree.wheelsfreebff.mapper.ItemMapper;
import com.wheelsfree.wheelsfreebff.response.ItemsResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {

    private ItemMapper itemMapper;

    public ItemController(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

    @GetMapping("/items")
    public ItemsResponse getAllAvailableItems() {
        return new ItemsResponse(itemMapper.findInStockItems());
    }
}
