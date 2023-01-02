package com.ntt.lab3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ntt.lab3.entity.Cart;
import com.ntt.lab3.entity.User;
@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
}
