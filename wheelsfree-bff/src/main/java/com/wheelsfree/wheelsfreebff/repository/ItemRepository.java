package com.wheelsfree.wheelsfreebff.repository;

import com.wheelsfree.wheelsfreebff.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("FROM Item WHERE quantity > 0")
    List<Item> findInStockItems();
}
