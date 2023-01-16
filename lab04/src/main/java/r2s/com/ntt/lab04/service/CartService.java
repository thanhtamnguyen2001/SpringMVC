package com.r2s.ntt.service;

import com.r2s.ntt.dto.request.CreateCartRequestDTO;
import com.r2s.ntt.dto.request.CreateUserRequestDTO;
import com.r2s.ntt.dto.request.UpdateCategoryRequestDTO;
import com.r2s.ntt.dto.request.UpdateUserRequestDTO;
import com.r2s.ntt.dto.response.*;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CartService {
    PagingResponseDTO getAllCart(Pageable pageable);

    CartResponseDTO getCartById(Integer cartId);

    CartResponseDTO createCart(CreateCartRequestDTO createCartRequestDTO);

    Boolean deleteCart(Integer cartId);

    Boolean deleteCartTemporarily(Integer cartId);

}
