package com.ntt.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ntt.demo.dto.CreateOrderRequestDTO;
import com.ntt.demo.service.OrderService;

import java.util.Date;
import java.util.List;

@RestController()
@RequestMapping(value = "/order")
public class OrderController {
    private OrderService orderService = new OrderService();

    @GetMapping
    public ResponseEntity<?> getAllOrder() {
        List<CreateOrderRequestDTO> orderList = orderService.getListOrder();
        return ResponseEntity.ok(orderList);
    }

    @PostMapping
    public ResponseEntity insertOrder(@RequestBody CreateOrderRequestDTO createOrderRequestDTO) {
        int id = createOrderRequestDTO.getId();
        int cartId = createOrderRequestDTO.getCartId();
        long totalPay = createOrderRequestDTO.getTotalPay();
        Date orderDate = createOrderRequestDTO.getOrderDate();
        StringBuilder stringBuilder = new StringBuilder();
        String response = stringBuilder.append(id)
                .append(cartId)
                .append(totalPay)
                .append(orderDate)
                .toString();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}