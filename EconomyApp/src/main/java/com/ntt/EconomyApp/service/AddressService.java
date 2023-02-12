package com.ntt.EconomyApp.service;

import com.ntt.EconomyApp.dto.request.*;
import com.ntt.EconomyApp.dto.response.*;
import org.springframework.data.domain.Pageable;

public interface AddressService {

    PagingResponseDTO getAllAddress(Pageable pageable);

    AddressResponseDTO getAddressById(Integer addressId);

    AddressResponseDTO createAddress(CreateAddressRequestDTO createAddressRequestDTO);

    UpdateAddressResponseDTO updateAddress(Integer addressId, UpdateAddressRequestDTO updateAddressRequestDTO);

    Boolean deleteAddress(Integer addressId);

    Boolean deleteAddressTemporarily(Integer addressId);


}
