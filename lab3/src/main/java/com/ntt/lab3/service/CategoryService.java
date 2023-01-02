package com.ntt.lab3.service;

import com.ntt.lab3.dto.request.InsertCategoryRequestDTO;
import com.ntt.lab3.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategoryDatabase();

    Category insertCategory(InsertCategoryRequestDTO requestDTO);
}
