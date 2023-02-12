package com.ntt.EconomyApp.service;

import com.ntt.EconomyApp.dto.request.CreateCartRequestDTO;
import com.ntt.EconomyApp.dto.response.*;
import org.springframework.data.domain.Pageable;

public interface CartService {
    PagingResponseDTO getAllCart(Pageable pageable);

    CartResponseDTO getCartById(Integer cartId);

    CartResponseDTO createCart(CreateCartRequestDTO createCartRequestDTO);

    Boolean deleteCart(Integer cartId);

    Boolean deleteCartTemporarily(Integer cartId);

}
