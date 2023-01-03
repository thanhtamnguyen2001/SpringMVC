package com.ntt.lab3.service;

import com.ntt.lab3.dto.request.InsertCartRequestDTO;
import com.ntt.lab3.entity.Cart;

import java.util.List;

public interface CartService {

    List<Cart> getAllCartDatabase();

    Cart insertCart(InsertCartRequestDTO requestDTO);
    
}
