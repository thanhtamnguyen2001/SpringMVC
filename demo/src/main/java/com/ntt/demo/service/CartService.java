package com.ntt.demo.service;


import java.util.ArrayList;
import java.util.List;

import com.ntt.demo.dto.CreateCartRequestDTO;

public class CartService {
    public List<CreateCartRequestDTO> getListCart(){
        List<CreateCartRequestDTO> cartList= new ArrayList<>();
        CreateCartRequestDTO cart1= new CreateCartRequestDTO(1,1);
        CreateCartRequestDTO cart2= new CreateCartRequestDTO(2,2);
        cartList.add(cart1);
        cartList.add(cart2);
        return cartList;
    }
}