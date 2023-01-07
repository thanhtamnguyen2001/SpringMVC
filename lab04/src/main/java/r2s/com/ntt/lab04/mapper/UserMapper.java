package r2s.com.demo.lab04.mapper;

import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import r2s.com.demo.lab04.dto.response.UserResponseDTO;
import r2s.com.demo.lab04.entity.User;

import java.util.List;
@Component
public class UserMapper {
    public List<UserResponseDTO> convertEntiitiesToResponseDtos(List<User> userList){
        return userList.stream().map(this:: convertEntiitiesToResponseDto).toList();
    }

    public UserResponseDTO convertEntiitiesToResponseDto(User user) {
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        BeanUtils.copyProperties( user, userResponseDTO);
        return userResponseDTO;
    }
}
