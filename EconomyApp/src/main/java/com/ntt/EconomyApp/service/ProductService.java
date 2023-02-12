package com.ntt.EconomyApp.service;

import com.ntt.EconomyApp.dto.request.CreateProductRequestDTO;
import com.ntt.EconomyApp.dto.request.UpdateProductRequestDTO;
import com.ntt.EconomyApp.dto.response.*;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    PagingResponseDTO getAllProduct(Pageable pageable);

    ProductResponseDTO getProductById(Integer productId);

    ProductResponseDTO createProduct(CreateProductRequestDTO createProductRequestDTO);

    UpdateProductResponseDTO updateProduct(Integer productId, UpdateProductRequestDTO updateProductRequestDTO);

    Boolean deleteProduct(Integer productId);

    Boolean deleteProductTemporarily(Integer productId);
}
