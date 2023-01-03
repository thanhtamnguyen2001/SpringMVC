package com.ntt.lab3.dto.request;

import lombok.Data;

@Data
public class InsertAddressRequestDTO {

    private String name;

    private String phone;

    private String province;

    private String district;

    private String street;

    private boolean type;

    private boolean defaultAddress;

    private boolean isDeleted;
    
    private int userId;
}
