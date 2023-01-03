package com.ntt.lab3.service;

import com.ntt.lab3.dto.request.InsertAddressRequestDTO;
import com.ntt.lab3.entity.Address;

import java.util.List;

public interface AddressService {

    List<Address> getAllAddressDatabase();

    Address insertAddress(InsertAddressRequestDTO requestDTO);
    
}
