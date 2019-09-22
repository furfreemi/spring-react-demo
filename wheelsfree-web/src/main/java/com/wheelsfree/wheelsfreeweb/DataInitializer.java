package com.wheelsfree.wheelsfreeweb;

import com.wheelsfree.wheelsfreeweb.model.Item;
import com.wheelsfree.wheelsfreeweb.repository.ItemRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;

@Component
public class DataInitializer {
    private ItemRepository itemRepository;

    public DataInitializer(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initializeData() {
        itemRepository.saveAll(Arrays.asList(
                new Item(1L, "Fancy Drone", "Good base model drone.", BigDecimal.valueOf(100.25), 50, "https://images.pexels.com/photos/336232/pexels-photo-336232.jpeg"),
                new Item(2L, "Super Fancy Drone", "The best drone money can buy.", BigDecimal.valueOf(229.99), 10, "https://images.pexels.com/photos/442587/pexels-photo-442587.jpeg"),
                new Item(3L, "Fancier Drone", "Starting to become an advanced drone user.", BigDecimal.valueOf(159.85), 25, "https://images.pexels.com/photos/2100075/pexels-photo-2100075.jpeg")
        ));
        itemRepository.flush();
    }
}
