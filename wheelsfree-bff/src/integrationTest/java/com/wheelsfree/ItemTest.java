package com.wheelsfree;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wheelsfree.mapper.ItemMapper;
import com.wheelsfree.model.Item;
import com.wheelsfree.response.ItemsResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ItemTest {
    @MockBean
    private ItemMapper itemMapper;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    void shouldReturnAllItems() throws Exception {
        List<Item> expectedItems = Arrays.asList(
                new Item(1, "arbitrary1", "arbitrary description 1", BigDecimal.TEN, 10L, "arbitraryUrl1"),
                new Item(2, "arbitrary2", "arbitrary description 2", BigDecimal.ONE, 20L, "arbitraryUrl2")
        );
        when(itemMapper.findInStockItems()).thenReturn(expectedItems);

        MockHttpServletResponse response =
                mockMvc.perform(get("/items"))
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                    .andExpect(status().isOk())
                    .andReturn().getResponse();

        ItemsResponse actualItemResponse = objectMapper.readValue(response.getContentAsString(), ItemsResponse.class);
        assertThat(actualItemResponse.getItems(), is(expectedItems));
    }
}
