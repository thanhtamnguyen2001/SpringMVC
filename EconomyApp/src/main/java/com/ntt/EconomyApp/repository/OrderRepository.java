package com.ntt.EconomyApp.repository;

import com.ntt.EconomyApp.entity.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrderRepository extends CrudRepository<Bill, Integer> {

    Optional<Page<Bill>> findAllByIsDeleted(Boolean isDeleted, Pageable pageable);

    Optional<Page<Bill>> findAll(Pageable pageable);
}
