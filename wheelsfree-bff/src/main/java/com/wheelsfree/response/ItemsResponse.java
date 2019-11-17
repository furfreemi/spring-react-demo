package com.wheelsfree.response;

import com.wheelsfree.model.Item;

import java.util.Collections;
import java.util.List;

public class ItemsResponse {

    private List<Item> items;

    public ItemsResponse(List<Item> items) {
        this.items = items;
    }

    public ItemsResponse() {
        this(Collections.emptyList());
    }

    public List<Item> getItems() {
        return items;
    }
}
