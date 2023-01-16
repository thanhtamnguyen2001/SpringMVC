package com.r2s.ntt.service;

import com.r2s.ntt.dto.request.*;
import com.r2s.ntt.dto.response.*;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AddressService {

    PagingResponseDTO getAllAddress(Pageable pageable);

    AddressResponseDTO getAddressById(Integer addressId);

    AddressResponseDTO createAddress(CreateAddressRequestDTO createAddressRequestDTO);

    UpdateAddressResponseDTO updateAddress(Integer addressId, UpdateAddressRequestDTO updateAddressRequestDTO);

    Boolean deleteAddress(Integer addressId);

    Boolean deleteAddressTemporarily(Integer addressId);


}
