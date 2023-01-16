package com.r2s.ntt.service;

import com.r2s.ntt.dto.request.CreateCategoryRequestDTO;
import com.r2s.ntt.dto.request.UpdateCategoryRequestDTO;
import com.r2s.ntt.dto.response.CategoryResponseDTO;
import com.r2s.ntt.dto.response.PagingResponseDTO;
import com.r2s.ntt.dto.response.ProductOfCategoryResponseDTO;
import com.r2s.ntt.dto.response.UpdateCategoryResponseDTO;
import com.r2s.ntt.entity.Category;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    PagingResponseDTO getAllCategory(Pageable pageable);

    CategoryResponseDTO getCategoryById(Integer cateId);

    CategoryResponseDTO createCategory(CreateCategoryRequestDTO createCategoryRequestDTO);

    UpdateCategoryResponseDTO updateCategory(Integer cateId, UpdateCategoryRequestDTO updateCategoryRequestDTO);

    Boolean deleteCategory(Integer cateId);

    Boolean deleteCategoryTemporarily(Integer cateId);

    ProductOfCategoryResponseDTO getProductByCategoryId(Integer cateId);

}
