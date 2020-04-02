package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.OrderService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class DemoApplication {

    @Autowired
    UserService userService;
    @Resource
    OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }


    @PostMapping("/addOrder")
    public void addOrder() {
        for (int i = 0; i < 10; i++) {
            orderService.addOrder(i);
        }
    }

}
