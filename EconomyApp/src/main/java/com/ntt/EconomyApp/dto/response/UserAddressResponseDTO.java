package com.ntt.EconomyApp.dto.response;

import com.ntt.EconomyApp.entity.Address;
import com.ntt.EconomyApp.entity.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddressResponseDTO implements Serializable {

    private Employer userId;

    private Address addressId;

    private Boolean isDefaulted;
}
