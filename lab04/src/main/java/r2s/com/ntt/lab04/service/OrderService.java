package r2s.com.demo.lab04.service;

import r2s.com.demo.lab04.dto.request.InsertOrderRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateOrderRequestDTO;
import r2s.com.demo.lab04.dto.response.OrderResponseDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrderDatabase();

    PageResponseDTO getOrderPaging();

    Order insertOrder(InsertOrderRequestDTO requestDTO);

    OrderResponseDTO getOrderbyId(Integer id);

    OrderResponseDTO updateOrder(UpdateOrderRequestDTO requestDTO, Integer id);

    void deleteOrderbyId(Integer id);
}
