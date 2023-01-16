package com.r2s.ntt.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateOrderRequestDTO implements Serializable {

    private Double transportationFee;

    private Double totalPrice;
}
