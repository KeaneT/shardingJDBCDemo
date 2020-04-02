package com.example.demo.mapper;


import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Select("select * from t_order")
    List<Order> list();

    @Insert("insert into t_order(user_id)values(#{user_id})")
    void addOrder(@Param("user_id") int user_id);

    @Delete("delete from t_order")
    void deleteAll();


}
