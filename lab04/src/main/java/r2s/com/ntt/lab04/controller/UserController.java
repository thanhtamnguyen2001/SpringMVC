package r2s.com.ntt.lab04.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import r2s.com.demo.lab04.dto.request.InsertUserRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateUserRequestDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.dto.response.UserResponseDTO;
import r2s.com.demo.lab04.entity.User;
import r2s.com.demo.lab04.service.UserService;

import java.util.List;

@RestController()
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<?> getUserPaging() {
        PageResponseDTO pageResponseDTO = userService.getUserPaging();
        return new ResponseEntity<>(pageResponseDTO, HttpStatus.OK);
    }

    @GetMapping("/{user-id}")
    public ResponseEntity<?> getUserById(@PathVariable(value = "user-id") int userId) {
        UserResponseDTO UserResponseDTO = userService.getUserbyId(userId);
        return new ResponseEntity<>(UserResponseDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity insertUser(@RequestBody InsertUserRequestDTO requestDTO) {
        User user = userService.insertUser(requestDTO);
        return new ResponseEntity(user, HttpStatus.OK);
    }


    @PutMapping("/{user-id}")
    public ResponseEntity updateUser(@PathVariable(value = "user-id") int userId,
                                     @RequestBody UpdateUserRequestDTO updateUserRequestDTO) {
        UserResponseDTO response = userService.updateUser(updateUserRequestDTO, userId);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @DeleteMapping("/{user-id}")
    public ResponseEntity deleteUser(@PathVariable(value = "user-id") int userId) {
        userService.deleteUserbyId(userId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{user-id}/address")
    public ResponseEntity<?> getAddressByUserId(@PathVariable(value = "user-id") int userId) {
        UserResponseDTO UserResponseDTO = userService.getAddressByUserId(userId);
        return new ResponseEntity<>(UserResponseDTO, HttpStatus.OK);
    }

}
