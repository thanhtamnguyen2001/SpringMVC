package r2s.com.demo.lab04.service;

import r2s.com.demo.lab04.dto.request.InsertUserRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateUserRequestDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.dto.response.UserResponseDTO;
import r2s.com.demo.lab04.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUserDatabase();

    PageResponseDTO getUserPaging();

    User insertUser(InsertUserRequestDTO requestDTO);

    UserResponseDTO getUserbyId(Integer id);


    UserResponseDTO updateUser(UpdateUserRequestDTO requestDTO, Integer id);

    void deleteUserbyId(Integer id);

    UserResponseDTO getAddressByUserId(int userId);
}
