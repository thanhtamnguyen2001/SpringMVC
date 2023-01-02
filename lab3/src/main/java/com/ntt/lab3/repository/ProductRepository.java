package com.ntt.lab3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ntt.lab3.entity.Product;
import com.ntt.lab3.entity.User;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
