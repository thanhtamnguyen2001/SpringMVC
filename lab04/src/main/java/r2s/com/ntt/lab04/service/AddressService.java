package r2s.com.demo.lab04.service;

import r2s.com.demo.lab04.dto.request.InsertAddressRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateAddressRequestDTO;
import r2s.com.demo.lab04.dto.response.AddressResponseDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddressDatabase();

    PageResponseDTO getAddressPaging();

    Address insertAddress(InsertAddressRequestDTO requestDTO);

    AddressResponseDTO getAddressbyId(Integer id);

    AddressResponseDTO updateAddress(UpdateAddressRequestDTO requestDTO, Integer id);

    void deleteAddressbyId(Integer id);
}
