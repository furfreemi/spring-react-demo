package com.wheelsfree.wheelsfreeweb.response;

import com.wheelsfree.wheelsfreeweb.model.Item;

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
