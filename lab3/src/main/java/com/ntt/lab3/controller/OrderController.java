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


//    @PutMapping("/{order-id}")
//    public ResponseEntity updateOrder(@PathVariable(value = "order-id") int orderId,
//                                      @RequestBody UpdateOrderRequestDTO updateOrderRequestDTO) {
//        OrderResponseDTO response = new OrderResponseDTO();
//        response.setId(orderId);
//        response.setCartId(updateOrderRequestDTO.getCartId());
//        response.setStatus(updateOrderRequestDTO.isStatus());
//        response.setOrderDate(updateOrderRequestDTO.getOrderDate());
//        response.setTotalPay(updateOrderRequestDTO.getTotalPay());
//
//        return new ResponseEntity(response, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{order-id}")
//    public ResponseEntity deleteOrder(@PathVariable(value = "order-id") int orderId) {
//        return new ResponseEntity(HttpStatus.NO_CONTENT);
//    }
}
