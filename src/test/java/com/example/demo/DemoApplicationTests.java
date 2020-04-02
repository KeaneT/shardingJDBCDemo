package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        List<User> list = userService.list();
        System.err.println(list.size());
    }

}
