package com.ntt.lab3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ntt.lab3.entity.Address;
import com.ntt.lab3.entity.Cart;
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
}
