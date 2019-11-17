package com.wheelsfree.mapper;

import com.wheelsfree.model.Item;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ItemMapper {

    String ITEM_MAPPING = "itemResultMapping";

    @Select(
            "SELECT * " +
            "FROM item " +
            "WHERE quantity > 0"
    )
    @Results(id = ITEM_MAPPING, value = {
            @Result(property = "imageUrl", column = "image_url")
    })
    List<Item> findInStockItems();

    @Insert(
            "INSERT INTO item (name, description, price, quantity, image_url) " +
            "VALUES (#{name}, #{description}, #{price}, #{quantity}, #{imageUrl})"
    )
    @Options(useGeneratedKeys = true)
    Integer insert(Item item);

    @Delete(
        "DELETE FROM item " +
        "WHERE id = #{id}"
    )
    void delete(Integer id);
}
