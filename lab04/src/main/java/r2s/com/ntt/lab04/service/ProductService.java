package com.r2s.ntt.service;

import com.r2s.ntt.dto.request.CreateCategoryRequestDTO;
import com.r2s.ntt.dto.request.CreateProductRequestDTO;
import com.r2s.ntt.dto.request.UpdateCategoryRequestDTO;
import com.r2s.ntt.dto.request.UpdateProductRequestDTO;
import com.r2s.ntt.dto.response.*;
import com.r2s.ntt.entity.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    PagingResponseDTO getAllProduct(Pageable pageable);

    ProductResponseDTO getProductById(Integer productId);

    ProductResponseDTO createProduct(CreateProductRequestDTO createProductRequestDTO);

    UpdateProductResponseDTO updateProduct(Integer productId, UpdateProductRequestDTO updateProductRequestDTO);

    Boolean deleteProduct(Integer productId);

    Boolean deleteProductTemporarily(Integer productId);
}
