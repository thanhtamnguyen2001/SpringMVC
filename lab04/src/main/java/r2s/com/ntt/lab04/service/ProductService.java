package r2s.com.demo.lab04.service;

import r2s.com.demo.lab04.dto.request.InsertProductRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateProductRequestDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.dto.response.ProductResponseDTO;
import r2s.com.demo.lab04.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProductDatabase();

    PageResponseDTO getProductPaging();

    Product insertProduct(InsertProductRequestDTO requestDTO);

    ProductResponseDTO getProductbyId(Integer id);

    ProductResponseDTO updateProduct(UpdateProductRequestDTO requestDTO, Integer id);

    void deleteProductbyId(Integer id);
}
