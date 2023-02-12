package com.ntt.EconomyApp.repository;

import com.ntt.EconomyApp.entity.UserAddress;
import org.springframework.data.repository.CrudRepository;

public interface UserAddressRepository extends CrudRepository<UserAddress, Integer> {

   Iterable<UserAddress> findAllByUserId (Integer userId);
}
