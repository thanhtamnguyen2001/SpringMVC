package com.ntt.EconomyApp.service;

import com.ntt.EconomyApp.dto.request.CreateCategoryRequestDTO;
import com.ntt.EconomyApp.dto.request.UpdateCategoryRequestDTO;
import com.ntt.EconomyApp.dto.response.CategoryResponseDTO;
import com.ntt.EconomyApp.dto.response.PagingResponseDTO;
import com.ntt.EconomyApp.dto.response.ProductOfCategoryResponseDTO;
import com.ntt.EconomyApp.dto.response.UpdateCategoryResponseDTO;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    PagingResponseDTO getAllCategory(Pageable pageable);

    CategoryResponseDTO getCategoryById(Integer cateId);

    CategoryResponseDTO createCategory(CreateCategoryRequestDTO createCategoryRequestDTO);

    UpdateCategoryResponseDTO updateCategory(Integer cateId, UpdateCategoryRequestDTO updateCategoryRequestDTO);

    Boolean deleteCategory(Integer cateId);

    Boolean deleteCategoryTemporarily(Integer cateId);

    ProductOfCategoryResponseDTO getProductByCategoryId(Integer cateId);

}
