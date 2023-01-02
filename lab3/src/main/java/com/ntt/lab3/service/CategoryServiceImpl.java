package com.ntt.lab3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ntt.lab3.dto.request.InsertCategoryRequestDTO;
import com.ntt.lab3.entity.Category;
import com.ntt.lab3.repository.CategoryRepository;

import java.util.List;
@Component
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategoryDatabase() {
        Iterable<Category> categoryIterable = categoryRepository.findAll();
        return (List<Category>) categoryIterable;
    }


    @Override
    public Category insertCategory(InsertCategoryRequestDTO requestDTO) {
        Category category= new Category();
        category.setName(requestDTO.getName());
        categoryRepository.save(category);
        return category;
    }
}
