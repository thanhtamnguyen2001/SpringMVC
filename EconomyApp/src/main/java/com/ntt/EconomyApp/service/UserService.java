package com.ntt.EconomyApp.service;

import com.ntt.EconomyApp.dto.request.CreateUserRequestDTO;
import com.ntt.EconomyApp.dto.request.UpdateUserRequestDTO;
import com.ntt.EconomyApp.dto.response.*;
import org.springframework.data.domain.Pageable;

public interface UserService {

    PagingResponseDTO getAllUser(Pageable pageable);

    UserResponseDTO getUserById(Integer userId);

    UserResponseDTO createUser(CreateUserRequestDTO createUserRequestDTO);

    UpdateUserResponseDTO updateUser(Integer userId, UpdateUserRequestDTO updateUserRequestDTO);

    Boolean deleteUser(Integer userId);

    Boolean deleteUserTemporarily(Integer userId);

    ProductOfUserResponseDTO getProductByUserId(Integer userId);

    AddressOfUserResponseDTO getAddressByUserId(Integer userId);
}
