package com.ntt.demo.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ntt.demo.dto.CreateOrderRequestDTO;

public class OrderService {
    public List<CreateOrderRequestDTO> getListOrder(){
        List<CreateOrderRequestDTO> orderList= new ArrayList<>();
        CreateOrderRequestDTO order1= new CreateOrderRequestDTO(1,200000,new Date(2022,1,1),true,1);
        CreateOrderRequestDTO order2= new CreateOrderRequestDTO(2,200000,new Date(2022,1,1),true,1);
        orderList.add(order1);
        orderList.add(order2);
        return orderList;
    }
}