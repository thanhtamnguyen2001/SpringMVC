package com.ntt.demo.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ntt.demo.dto.CreateUserRequestDTO;

public class UserService {


    public List<CreateUserRequestDTO> getListUser(){
        List<CreateUserRequestDTO> userList= new ArrayList<>();
        CreateUserRequestDTO user1= new CreateUserRequestDTO(1,"minhvy1", "Nguyen Minh Vy 1","111111","123456","Nam","vynguyen@gmail.com",new Date(2001,3,2));
        CreateUserRequestDTO user2= new CreateUserRequestDTO(2,"minhvy2", "Nguyen Minh Vy 2","111111","123456","Nam","vynguyen@gmail.com",new Date(2020,3,2));
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}