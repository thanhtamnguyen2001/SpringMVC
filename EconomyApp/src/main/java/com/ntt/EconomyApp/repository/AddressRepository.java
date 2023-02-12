package com.ntt.EconomyApp.repository;

import com.ntt.EconomyApp.entity.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AddressRepository extends CrudRepository<Address, Integer> {

    Optional<Page<Address>> findAllByIsDeleted(Boolean isDeleted, Pageable pageable);

    Optional<Page<Address>> findAll(Pageable pageable);
}
