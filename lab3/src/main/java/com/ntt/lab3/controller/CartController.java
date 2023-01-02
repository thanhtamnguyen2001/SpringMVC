package com.ntt.lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ntt.lab3.dto.request.InsertCartRequestDTO;
import com.ntt.lab3.entity.Cart;
import com.ntt.lab3.service.CartService;

import java.util.List;

@RestController()
@RequestMapping(value = "/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping
    public ResponseEntity<?> getAllCart() {
        List<Cart> cartList = cartService.getAllCartDatabase();
        return new ResponseEntity(cartList, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity insertCart(@RequestBody InsertCartRequestDTO requestDTO) {
        Cart cart = cartService.insertCart(requestDTO);
        return new ResponseEntity(cart, HttpStatus.OK);
    }



//
//    @DeleteMapping("/{cart-id}")
//    public ResponseEntity deleteCart(@PathVariable(value = "cart-id") int cartId) {
//        return new ResponseEntity(HttpStatus.NO_CONTENT);
//    }
}
