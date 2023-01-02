package com.ntt.lab3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ntt.lab3.entity.Order;
import com.ntt.lab3.entity.User;
@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
