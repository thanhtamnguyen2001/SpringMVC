package r2s.com.demo.lab04.service;

import r2s.com.demo.lab04.dto.request.InsertCartRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateCartRequestDTO;
import r2s.com.demo.lab04.dto.response.CartResponseDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.entity.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getAllCartDatabase();

    PageResponseDTO getCartPaging();

    Cart insertCart(InsertCartRequestDTO requestDTO);

    CartResponseDTO getCartbyId(Integer id);

    CartResponseDTO updateCart(UpdateCartRequestDTO requestDTO, Integer id);

    void deleteCartbyId(Integer id);
}
