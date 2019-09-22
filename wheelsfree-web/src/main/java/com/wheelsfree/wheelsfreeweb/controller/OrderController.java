package com.wheelsfree.wheelsfreeweb.controller;

import com.wheelsfree.wheelsfreeweb.model.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

    @PostMapping("/orders")
    public Order createQuestion(@RequestBody Order order) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }

}
