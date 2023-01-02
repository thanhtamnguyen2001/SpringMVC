package com.ntt.lab3.dto.request;

import lombok.Data;

@Data
public class InsertProductRequestDTO {
    private String name;
    private long price;
    private String salerName;
    private boolean isDeleted;
    private int categoryId;
}
