package com.ntt.EconomyApp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAddressResponseDTO implements Serializable {

    private Integer id;

    private String apartmentNumber;

    private String street;

    private String ward;

    private String district;

    private String province;
}