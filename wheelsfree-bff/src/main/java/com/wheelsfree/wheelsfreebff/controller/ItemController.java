package com.wheelsfree.wheelsfreebff.controller;

import com.wheelsfree.wheelsfreebff.repository.ItemRepository;
import com.wheelsfree.wheelsfreebff.response.ItemsResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {

    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/items")
    public ItemsResponse getAllAvailableItems() {
        return new ItemsResponse(itemRepository.findInStockItems());
    }
}
