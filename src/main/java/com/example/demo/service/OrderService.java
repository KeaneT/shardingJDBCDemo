package com.example.demo.service;


import com.example.demo.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> list();

    void addOrder(int user_id);

    void deleteAll();

}
