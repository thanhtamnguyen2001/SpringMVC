package com.ntt.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ntt.demo.dto.CreateProductRequestDTO;
import com.ntt.demo.service.ProductService;

import java.util.Date;
import java.util.List;

@RestController()
@RequestMapping(value = "/product")
public class ProductController {
    private ProductService productService = new ProductService();

    @GetMapping
    public ResponseEntity<?> getAllProduct() {
        List<CreateProductRequestDTO> productList = productService.getListProduct();
        return ResponseEntity.ok(productList);
    }

    @PostMapping
    public ResponseEntity insertProduct(@RequestBody CreateProductRequestDTO createProductRequestDTO) {
        int id = createProductRequestDTO.getId();
        String name = createProductRequestDTO.getName();
        long price = createProductRequestDTO.getPrice();
        String salerName = createProductRequestDTO.getSalerName();
        int categoryId = createProductRequestDTO.getCategoryId();
        StringBuilder stringBuilder = new StringBuilder();
        String response = stringBuilder.append(id)
                .append(name)
                .append(price)
                .append(salerName)
                .append(categoryId)
                .toString();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}