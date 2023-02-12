package com.ntt.EconomyApp.service;

import com.ntt.EconomyApp.dto.request.CreateOrderRequestDTO;
import com.ntt.EconomyApp.dto.response.OrderResponseDTO;
import com.ntt.EconomyApp.dto.response.PagingResponseDTO;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    PagingResponseDTO getAllOrder(Pageable pageable);

    OrderResponseDTO getOrderById(Integer orderId);

    OrderResponseDTO createOrder(CreateOrderRequestDTO createOrderRequestDTO);

    Boolean deleteOrder(Integer orderId);

    Boolean deleteOrderTemporarily(Integer orderId);
}
