package com.wheelsfree.wheelsfreeweb.service;

import com.wheelsfree.wheelsfreeweb.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    public List<Item> getAllAvailableItems() {
        return new ArrayList<>();
    }
}
