package com.wheelsfree.wheelsfreebff.mapper;

import com.wheelsfree.wheelsfreebff.model.Item;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
}
