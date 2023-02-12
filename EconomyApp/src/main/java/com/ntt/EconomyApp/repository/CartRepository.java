package com.ntt.EconomyApp.repository;

import com.ntt.EconomyApp.entity.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Optional<Page<Cart>> findAllByIsDeleted(Boolean isDeleted, Pageable pageable);

    Optional<Page<Cart>> findAll(Pageable pageable);
}
