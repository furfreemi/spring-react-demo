package com.wheelsfree.wheelsfreebff.service;

import com.wheelsfree.wheelsfreebff.mapper.ItemMapper;
import com.wheelsfree.wheelsfreebff.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private ItemMapper itemMapper;

    public ItemService(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

    public List<Item> getInStockItems() {
        return itemMapper.findInStockItems();
    }
}
