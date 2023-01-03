package com.ntt.lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ntt.lab3.dto.request.InsertOrderRequestDTO;
import com.ntt.lab3.entity.Order;
import com.ntt.lab3.service.OrderService;

import java.util.List;

@RestController()
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<?> getAllOrder() {
        List<Order> orderList = orderService.getAllOrderDatabase();
        return new ResponseEntity(orderList, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity insertOrder(@RequestBody InsertOrderRequestDTO requestDTO) {
        Order order = orderService.insertOrder(requestDTO);
        return new ResponseEntity(order, HttpStatus.OK);
    }

}
