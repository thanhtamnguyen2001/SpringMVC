package com.r2s.ntt.repository;

import com.r2s.ntt.entity.Address;
import com.r2s.ntt.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

import static com.r2s.ntt.constants.Constants.ADDRESS_IS_DELETED_0;

public interface AddressRepository extends CrudRepository<Address, Integer> {

    Optional<Page<Address>> findAllByIsDeleted(Boolean isDeleted, Pageable pageable);

    Optional<Page<Address>> findAll(Pageable pageable);
}
