package com.ntt.lab3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ntt.lab3.dto.request.InsertProductRequestDTO;
import com.ntt.lab3.dto.request.InsertProductRequestDTO;
import com.ntt.lab3.entity.Product;
import com.ntt.lab3.entity.Product;
import com.ntt.lab3.repository.ProductRepository;

import java.util.List;
@Component
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProductDatabase() {
        Iterable<Product> productIterable = productRepository.findAll();
        return (List<Product>) productIterable;
    }


    @Override
    public Product insertProduct(InsertProductRequestDTO requestDTO) {
        Product product= new Product();
        product.setName(requestDTO.getName());
        product.setCategoryId(requestDTO.getCategoryId());
        product.setDeleted(requestDTO.isDeleted());
        product.setPrice(requestDTO.getPrice());
        product.setSalerName(requestDTO.getSalerName());
        productRepository.save(product);
        return product;
    }
}
