package com.r2s.ntt.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponseDTO implements Serializable {

    private Integer id;

    private String apartmentNumber;

    private String street;

    private String ward;

    private String district;

    private String province;

}
