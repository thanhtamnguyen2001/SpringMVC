package com.ntt.EconomyApp.mapper;

import com.ntt.EconomyApp.dto.response.CategoryResponseDTO;
import com.ntt.EconomyApp.dto.response.UpdateCategoryResponseDTO;
import com.ntt.EconomyApp.entity.Category;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntityMapper<S, T> {

    public List<CategoryResponseDTO> convertEntitiesToResponseDTOs (List<Category> categoryList) {

        return categoryList.stream().map(this::convertEntityToResponseDTO).toList();
    }

    public CategoryResponseDTO convertEntityToResponseDTO(Category category) {

        CategoryResponseDTO responseDTO = new CategoryResponseDTO();
        BeanUtils.copyProperties(category, responseDTO);

        return responseDTO;
    }

    public UpdateCategoryResponseDTO convertEntityToUpdateResponseDTO(Category category) {

        UpdateCategoryResponseDTO updateResponseDTO = new UpdateCategoryResponseDTO();
        BeanUtils.copyProperties(category, updateResponseDTO);

        return updateResponseDTO;
    }
}
