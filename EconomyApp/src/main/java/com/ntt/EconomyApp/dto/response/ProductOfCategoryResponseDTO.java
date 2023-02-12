package com.ntt.EconomyApp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOfCategoryResponseDTO implements Serializable {

    private Integer id;

    private String name;

    private Set<ProductResponseDTO> products;
}
