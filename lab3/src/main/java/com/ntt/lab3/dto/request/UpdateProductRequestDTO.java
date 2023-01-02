package com.ntt.lab3.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequestDTO implements Serializable {
    private int id;
    private String name;
    private long price;
    private String salerName;
    private boolean isDeleted;
    private int categoryId;
}
