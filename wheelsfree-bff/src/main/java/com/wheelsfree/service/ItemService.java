package com.wheelsfree.service;

import com.wheelsfree.mapper.ItemMapper;
import com.wheelsfree.model.Item;
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
