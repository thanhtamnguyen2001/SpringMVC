package com.ntt.lab3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ntt.lab3.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
