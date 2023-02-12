package com.ntt.EconomyApp.repository;

import com.ntt.EconomyApp.entity.Category;
import com.ntt.EconomyApp.entity.Employer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Employer, Integer> {

    Optional<Page<Employer>> findAllByIsDeleted(Boolean isDeleted, Pageable pageable);

    Boolean existsByUsername(String username);

    Optional<Page<Category>> findAll(Pageable pageable);
}
