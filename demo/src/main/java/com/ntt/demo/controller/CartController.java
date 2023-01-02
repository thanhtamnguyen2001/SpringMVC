package com.ntt.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ntt.demo.dto.CreateCartRequestDTO;
import com.ntt.demo.service.CartService;

import java.util.List;

@RestController()
@RequestMapping(value = "/cart")
public class CartController {
    private CartService cartService = new CartService();

    @GetMapping
    public ResponseEntity<?> getAllCategory() {
        List<CreateCartRequestDTO> cartList = cartService.getListCart();
        return ResponseEntity.ok(cartList);
    }

    @PostMapping
    public ResponseEntity insertcaegory(@RequestBody CreateCartRequestDTO createCartRequestDTO) {
        int id = createCartRequestDTO.getId();
        int userId = createCartRequestDTO.getUserId();
        StringBuilder stringBuilder = new StringBuilder();
        String response = stringBuilder.append(id)
                .append(userId)
                .toString();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}