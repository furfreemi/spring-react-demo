package com.wheelsfree.wheelsfreebff.service;

import com.wheelsfree.wheelsfreebff.mapper.ItemMapper;
import com.wheelsfree.wheelsfreebff.model.Item;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ItemServiceTest {

    @Test
    void shouldGetAllInStockItemsFromItemMapper() {
        ItemMapper itemServiceMock = mock(ItemMapper.class);
        List<Item> expectedItems = Collections.singletonList(
                new Item(2, "arbitrary", "b", BigDecimal.ONE, 1L, "http://arbitrary")
        );
        when(itemServiceMock.findInStockItems()).thenReturn(expectedItems);
        ItemService itemController = new ItemService(itemServiceMock);

        List<Item> actualItems = itemController.getInStockItems();

        assertThat(actualItems, is(expectedItems));
    }

}