package com.ntt.EconomyApp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponseDTO implements Serializable {

    private Integer id;

    private String name;
}
