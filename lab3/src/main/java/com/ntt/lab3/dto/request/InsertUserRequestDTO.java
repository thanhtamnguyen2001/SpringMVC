package com.ntt.lab3.dto.request;

import lombok.Data;

import java.util.Date;
@Data
public class InsertUserRequestDTO {

    private String username;

    private String name;

    private String password;

    private String phone;

    private String gender;

    private String email;

    private Date birthday;
    
}
