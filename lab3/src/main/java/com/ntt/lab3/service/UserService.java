package com.ntt.lab3.service;

import com.ntt.lab3.dto.request.InsertUserRequestDTO;
import com.ntt.lab3.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUserDatabase();

    User insertUser(InsertUserRequestDTO requestDTO);
    
}
