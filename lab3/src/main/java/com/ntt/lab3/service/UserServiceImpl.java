package com.ntt.lab3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ntt.lab3.dto.request.InsertUserRequestDTO;
import com.ntt.lab3.entity.User;
import com.ntt.lab3.repository.UserRepository;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUserDatabase() {
        Iterable<User> userIterable = userRepository.findAll();
        return (List<User>) userIterable;
    }

    @Override
    public User insertUser(InsertUserRequestDTO requestDTO) {
        User user= new User();
        //user.setId(6);
        user.setName(requestDTO.getName());
        user.setPhone(requestDTO.getPhone());
        user.setPassword(requestDTO.getPassword());
        user.setBirthday(requestDTO.getBirthday());
        user.setGender(requestDTO.getGender());
        user.setUsername(requestDTO.getUsername());
        user.setEmail(requestDTO.getEmail());
        userRepository.save(user);
        return user;
    }
    
}
