package com.ntt.lab3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ntt.lab3.dto.request.InsertCartRequestDTO;
import com.ntt.lab3.entity.Cart;
import com.ntt.lab3.repository.CartRepository;

import java.util.List;
@Component
public class CartServiceImpl implements CartService{
    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> getAllCartDatabase() {
        Iterable<Cart> cartIterable = cartRepository.findAll();
        return (List<Cart>) cartIterable;
    }


    @Override
    public Cart insertCart(InsertCartRequestDTO requestDTO) {
        Cart cart= new Cart();
        cart.setUserId(requestDTO.getUserId());
        cartRepository.save(cart);
        return cart;
    }
}
