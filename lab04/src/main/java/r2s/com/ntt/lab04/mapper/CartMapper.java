package r2s.com.demo.lab04.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import r2s.com.demo.lab04.dto.response.CartResponseDTO;
import r2s.com.demo.lab04.entity.Cart;

import java.util.List;
@Component
public class CartMapper {
    public List<CartResponseDTO> convertEntiitiesToResponseDtos(List<Cart> cartList){
        return cartList.stream().map(this:: convertEntiitiesToResponseDto).toList();
    }

    public CartResponseDTO convertEntiitiesToResponseDto(Cart cart) {
        CartResponseDTO cartResponseDTO = new CartResponseDTO();
        BeanUtils.copyProperties( cart, cartResponseDTO);
        return cartResponseDTO;
    }
}
