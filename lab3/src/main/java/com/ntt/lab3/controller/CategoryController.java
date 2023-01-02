package com.ntt.lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ntt.lab3.dto.request.InsertCategoryRequestDTO;
import com.ntt.lab3.entity.Category;
import com.ntt.lab3.service.CategoryService;

import java.util.List;

@RestController()
@RequestMapping(value = "/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getAllCategory() {
        List<Category> categoryList = categoryService.getAllCategoryDatabase();
        return new ResponseEntity(categoryList, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity insertCategory(@RequestBody InsertCategoryRequestDTO requestDTO) {
        Category category = categoryService.insertCategory(requestDTO);
        return new ResponseEntity(category, HttpStatus.OK);
    }


//    @PutMapping("/{category-id}")
//    public ResponseEntity updateCategory(@PathVariable(value = "category-id") int categoryId,
//                                         @RequestBody UpdateProductRequestDTO updateProductRequestDTO) {
//        CategoryResponseDTO response = new CategoryResponseDTO();
//        response.setId(categoryId);
//        response.setName(updateProductRequestDTO.getName());
//
//        return new ResponseEntity(response, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{category-id}")
//    public ResponseEntity deleteCategory(@PathVariable(value = "category-id") int categoryId) {
//        return new ResponseEntity(HttpStatus.NO_CONTENT);
//    }
}
