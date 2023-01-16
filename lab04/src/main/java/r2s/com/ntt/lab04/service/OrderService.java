package com.r2s.ntt.service;

import com.r2s.ntt.dto.request.CreateOrderRequestDTO;
import com.r2s.ntt.dto.response.OrderResponseDTO;
import com.r2s.ntt.dto.response.PagingResponseDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {

    PagingResponseDTO getAllOrder(Pageable pageable);

    OrderResponseDTO getOrderById(Integer orderId);

    OrderResponseDTO createOrder(CreateOrderRequestDTO createOrderRequestDTO);

    Boolean deleteOrder(Integer orderId);

    Boolean deleteOrderTemporarily(Integer orderId);
}
