package r2s.com.ntt.lab04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import r2s.com.demo.lab04.dto.request.InsertCartRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateCartRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateCartRequestDTO;
import r2s.com.demo.lab04.dto.response.CartResponseDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.dto.response.CartResponseDTO;
import r2s.com.demo.lab04.entity.Cart;
import r2s.com.demo.lab04.service.CartService;

import java.util.List;

@RestController()
@RequestMapping(value = "/cart")
public class CartController {
    @Autowired
    private CartService cartService;


    @GetMapping
    public ResponseEntity<?> getCartPaging() {
        PageResponseDTO pageResponseDTO = cartService.getCartPaging();
        return new ResponseEntity<>(pageResponseDTO, HttpStatus.OK);
    }

    @GetMapping("/{cart-id}")
    public ResponseEntity<?> getCartById(@PathVariable(value = "cart-id") int cartId) {
        CartResponseDTO CartResponseDTO = cartService.getCartbyId(cartId);
        return new ResponseEntity<>(CartResponseDTO, HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity insertCart(@RequestBody InsertCartRequestDTO requestDTO) {
        Cart cart = cartService.insertCart(requestDTO);
        return new ResponseEntity(cart, HttpStatus.OK);
    }

    @PutMapping("/{Cart-id}")
    public ResponseEntity updateCart(@PathVariable(value = "Cart-id") int CartId,
                                     @RequestBody UpdateCartRequestDTO updateCartRequestDTO) {
        CartResponseDTO response = cartService.updateCart(updateCartRequestDTO, CartId);
        return new ResponseEntity(response, HttpStatus.OK);
    }


    @DeleteMapping("/{Cart-id}")
    public ResponseEntity deleteCart(@PathVariable(value = "Cart-id") int CartId) {
        cartService.deleteCartbyId(CartId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
