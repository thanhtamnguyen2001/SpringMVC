package com.ntt.lab3.service;

import com.ntt.lab3.dto.request.InsertProductRequestDTO;
import com.ntt.lab3.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProductDatabase();

    Product insertProduct(InsertProductRequestDTO requestDTO);
    
}
