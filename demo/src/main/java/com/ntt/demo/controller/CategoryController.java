package com.ntt.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ntt.demo.dto.CreateCategoryRequestDTO;
import com.ntt.demo.service.CategoryService;

import java.util.List;
@RestController()
@RequestMapping(value = "/category")
public class CategoryController {
    private CategoryService categoryService = new CategoryService();

    @GetMapping
    public ResponseEntity<?> getAllCategory() {
        List<CreateCategoryRequestDTO> categoryList = categoryService.getListCategory();
        return ResponseEntity.ok(categoryList);
    }

    @PostMapping
    public ResponseEntity insertcaegory(@RequestBody CreateCategoryRequestDTO categoryRequestDTO) {
        int id = categoryRequestDTO.getId();
        String name = categoryRequestDTO.getName();
        StringBuilder stringBuilder = new StringBuilder();
        String response = stringBuilder.append(id)
                .append(name)
                .toString();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}