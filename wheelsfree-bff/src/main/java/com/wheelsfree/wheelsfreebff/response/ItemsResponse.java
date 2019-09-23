package com.wheelsfree.wheelsfreebff.response;

import com.wheelsfree.wheelsfreebff.model.Item;

import java.util.List;

public class ItemsResponse {

    private List<Item> items;

    public ItemsResponse(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}
