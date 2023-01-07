package r2s.com.demo.lab04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import r2s.com.demo.lab04.dto.request.InsertProductRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateProductRequestDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.dto.response.ProductResponseDTO;
import r2s.com.demo.lab04.entity.Product;
import r2s.com.demo.lab04.mapper.ProductMapper;
import r2s.com.demo.lab04.repository.ProductRepository;

import java.util.List;
@Component
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAllProductDatabase() {
        Iterable<Product> productIterable = productRepository.findAll();
        return (List<Product>) productIterable;
    }
    @Override
    public PageResponseDTO getProductPaging() {
        Pageable pageable = Pageable.ofSize(2).withPage(0);
        Page<Product> productPage = productRepository.findAll(pageable)
                .orElseThrow(() -> new RuntimeException("Cant get product by paging"));
        PageResponseDTO pageResponseDTO = new PageResponseDTO();
        pageResponseDTO.setPage(productPage.getNumber());
        pageResponseDTO.setSize(productPage.getSize());
        pageResponseDTO.setTotalPages(productPage.getTotalPages());
        pageResponseDTO.setTotalRecord(productPage.getTotalElements());

        List<ProductResponseDTO> productResponseDTOS = productMapper.convertEntiitiesToResponseDtos(productPage.getContent());
        pageResponseDTO.setData(productResponseDTOS);
        return pageResponseDTO;
    }

    @Override
    @Transactional
    public Product insertProduct(InsertProductRequestDTO requestDTO) {
        Product product= new Product();
        product.setName(requestDTO.getName());
        product.setCategoryId(requestDTO.getCategoryId());
        product.setDeleted(requestDTO.isDeleted());
        product.setPrice(requestDTO.getPrice());
        product.setSalerName(requestDTO.getSalerName());
        productRepository.save(product);
        return product;
    }
    @Override
    public ProductResponseDTO getProductbyId(Integer id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant get product by this id"));

        ProductResponseDTO productResponseDTOS = productMapper.convertEntiitiesToResponseDto(product);
        return productResponseDTOS;
    }

    @Override
    @Transactional
    public ProductResponseDTO updateProduct(UpdateProductRequestDTO requestDTO, Integer id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant update product by this id"));
        product.setName(requestDTO.getName());
        product.setCategoryId(requestDTO.getCategoryId());
        product.setDeleted(requestDTO.isDeleted());
        product.setPrice(requestDTO.getPrice());
        product.setSalerName(requestDTO.getSalerName());
        productRepository.save(product);
        ProductResponseDTO productResponseDTO = productMapper.convertEntiitiesToResponseDto(product);
        return productResponseDTO;
    }

    @Override
    @Transactional
    public void deleteProductbyId(Integer id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant delete product by this id"));

        productRepository.delete(product);
    }
}
