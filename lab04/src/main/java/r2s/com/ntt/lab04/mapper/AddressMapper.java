package r2s.com.demo.lab04.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import r2s.com.demo.lab04.dto.response.AddressResponseDTO;
import r2s.com.demo.lab04.entity.Address;
import r2s.com.demo.lab04.entity.User;

import java.util.List;
@Component
public class AddressMapper {
    public List<AddressResponseDTO> convertEntiitiesToResponseDtos(List<Address> addressList){
        return addressList.stream().map(this:: convertEntiitiesToResponseDto).toList();
    }

    public AddressResponseDTO convertEntiitiesToResponseDto(Address address) {
        AddressResponseDTO AddressResponseDTO = new AddressResponseDTO();
        BeanUtils.copyProperties( address, AddressResponseDTO);
        return AddressResponseDTO;
    }
}
