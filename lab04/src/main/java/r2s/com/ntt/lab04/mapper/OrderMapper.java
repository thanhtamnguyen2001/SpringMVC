package r2s.com.demo.lab04.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import r2s.com.demo.lab04.dto.response.OrderResponseDTO;
import r2s.com.demo.lab04.entity.Order;

import java.util.List;
@Component
public class OrderMapper {
    public List<OrderResponseDTO> convertEntiitiesToResponseDtos(List<Order> orderList){
        return orderList.stream().map(this:: convertEntiitiesToResponseDto).toList();
    }

    public OrderResponseDTO convertEntiitiesToResponseDto(Order order) {
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        BeanUtils.copyProperties( order, orderResponseDTO);
        return orderResponseDTO;
    }
}
