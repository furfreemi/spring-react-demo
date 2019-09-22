package com.wheelsfree.wheelsfreeweb.controller;

import com.wheelsfree.wheelsfreeweb.model.Item;
import com.wheelsfree.wheelsfreeweb.service.ItemService;
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
    void shouldGetAllInStockItemsFromService() {
        ItemService itemService = mock(ItemService.class);
        List<Item> expectedItems = Collections.singletonList(
            new Item(1L, "arbitrary", "a", BigDecimal.TEN, 10)
        );
        when(itemService.getAllAvailableItems()).thenReturn(expectedItems);
        ItemController itemController = new ItemController(itemService);

        List<Item> actualItems = itemController.getAllAvailableItems();

        assertThat(actualItems, is(expectedItems));
    }

}