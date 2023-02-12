package com.ntt.EconomyApp.repository;

import com.ntt.EconomyApp.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

import static com.ntt.EconomyApp.constants.Constants.*;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    Optional<Page<Product>> findAllByIsDeleted(Boolean isDeleted, Pageable pageable);

    Boolean existsByName(String name);

    Optional<Page<Product>> findAll(Pageable pageable);
}
