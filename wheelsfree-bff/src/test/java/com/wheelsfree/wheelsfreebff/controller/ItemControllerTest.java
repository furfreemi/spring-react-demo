package com.wheelsfree.wheelsfreebff.controller;

import com.wheelsfree.wheelsfreebff.model.Item;
import com.wheelsfree.wheelsfreebff.repository.ItemRepository;
import com.wheelsfree.wheelsfreebff.response.ItemsResponse;
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
    void shouldGetAllInStockItems() {
        ItemRepository itemRepositoryMock = mock(ItemRepository.class);
        List<Item> expectedItems = Collections.singletonList(
            new Item(1L, "arbitrary", "a", BigDecimal.TEN, 10, "http://localhost")
        );
        when(itemRepositoryMock.findInStockItems()).thenReturn(expectedItems);
        ItemController itemController = new ItemController(itemRepositoryMock);

        ItemsResponse actualItems = itemController.getAllAvailableItems();

        assertThat(actualItems.getItems(), is(expectedItems));
    }

}