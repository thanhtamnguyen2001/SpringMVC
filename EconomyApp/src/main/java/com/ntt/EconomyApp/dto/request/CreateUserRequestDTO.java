package com.ntt.EconomyApp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequestDTO implements Serializable {

    private String firstName;

    private String lastName;

    private String username;

    private String password;

}
