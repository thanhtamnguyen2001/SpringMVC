package com.ntt.EconomyApp.controller;

import com.ntt.EconomyApp.dto.request.CreateProductRequestDTO;
import com.ntt.EconomyApp.dto.request.UpdateProductRequestDTO;
import com.ntt.EconomyApp.dto.response.*;
import com.ntt.EconomyApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/get-all")
    public ResponseEntity getAllProduct(Pageable pageable) {

        PagingResponseDTO pagingResponseDTO = productService.getAllProduct(pageable);

        return new ResponseEntity<>(pagingResponseDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/{product-id}")
    public ResponseEntity getProductById(@PathVariable("product-id") Integer productId) {
        ProductResponseDTO responseProductDTO = this.productService.getProductById(productId);

        return new ResponseEntity<>(responseProductDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity insertProduct(@RequestBody CreateProductRequestDTO createProductRequestDTO) {
        ProductResponseDTO productResponseDTO = this.productService.createProduct(createProductRequestDTO);

        return new ResponseEntity<>(productResponseDTO, HttpStatus.OK);
    }

    @PutMapping("/{product-id}")
    public ResponseEntity updateProduct(@PathVariable("product-id") Integer productId,
                                         @RequestBody UpdateProductRequestDTO updateProductRequestDTO) {
        UpdateProductResponseDTO response = this.productService.updateProduct(productId, updateProductRequestDTO);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{product-id}")
    public ResponseEntity deleteProduct(@PathVariable("product-id") Integer productId) {
        this.productService.deleteProductTemporarily(productId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
