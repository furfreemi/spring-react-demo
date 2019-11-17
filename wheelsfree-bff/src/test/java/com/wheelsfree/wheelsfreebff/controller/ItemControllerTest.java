package com.wheelsfree.wheelsfreebff.controller;

import com.wheelsfree.wheelsfreebff.model.Item;
import com.wheelsfree.wheelsfreebff.response.ItemsResponse;
import com.wheelsfree.wheelsfreebff.service.ItemService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ItemControllerTest {

    @Test
    void shouldGetAllInStockItemsFromItemService() {
        ItemService itemServiceMock = mock(ItemService.class);
        List<Item> expectedItems = Collections.singletonList(
            new Item(1, "arbitrary", "a", BigDecimal.TEN, 10L, "http://localhost")
        );
        when(itemServiceMock.getInStockItems()).thenReturn(expectedItems);
        ItemController itemController = new ItemController(itemServiceMock);

        ItemsResponse actualItemResponse = itemController.getAllAvailableItems();

        assertThat(actualItemResponse.getItems(), is(expectedItems));
    }

}