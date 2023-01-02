package com.ntt.lab3.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCartRequestDTO implements Serializable {
    private int id;
    private int userId;
}
