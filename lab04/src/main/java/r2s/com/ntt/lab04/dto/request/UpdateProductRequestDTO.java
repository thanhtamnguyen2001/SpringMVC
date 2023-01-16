package com.r2s.ntt.dto.request;

import com.r2s.ntt.dto.response.CategoryResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequestDTO implements Serializable {

    private String name;

    private Double price;

    private Integer quantity;

    private CategoryResponseDTO category;
}
