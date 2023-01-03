package com.ntt.lab3.service;

import com.ntt.lab3.dto.request.InsertOrderRequestDTO;
import com.ntt.lab3.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrderDatabase();

    Order insertOrder(InsertOrderRequestDTO requestDTO);
    
}
