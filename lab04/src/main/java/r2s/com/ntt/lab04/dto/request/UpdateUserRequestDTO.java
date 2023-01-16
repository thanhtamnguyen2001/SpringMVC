package com.r2s.ntt.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequestDTO implements Serializable {

    @JsonProperty("firstNameForUser")
    private String firstName;

    private String lastName;

    private String username;
}
