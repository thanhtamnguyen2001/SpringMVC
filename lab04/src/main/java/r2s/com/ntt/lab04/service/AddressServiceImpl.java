package r2s.com.demo.lab04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import r2s.com.demo.lab04.dto.request.InsertAddressRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateAddressRequestDTO;
import r2s.com.demo.lab04.dto.response.AddressResponseDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.entity.Address;
import r2s.com.demo.lab04.mapper.AddressMapper;
import r2s.com.demo.lab04.repository.AddressRepository;

import java.util.List;
@Component
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressMapper addressMapper;
    @Override
    public List<Address> getAllAddressDatabase() {
        Iterable<Address> addressIterable = addressRepository.findAll();
        return (List<Address>) addressIterable;
    }
    @Override
    public PageResponseDTO getAddressPaging() {
        Pageable pageable = Pageable.ofSize(2).withPage(0);
        Page<Address> addressPage = addressRepository.findAll(pageable)
                .orElseThrow(() -> new RuntimeException("Cant get address by paging"));
        PageResponseDTO pageResponseDTO = new PageResponseDTO();
        pageResponseDTO.setPage(addressPage.getNumber());
        pageResponseDTO.setSize(addressPage.getSize());
        pageResponseDTO.setTotalPages(addressPage.getTotalPages());
        pageResponseDTO.setTotalRecord(addressPage.getTotalElements());

        List<AddressResponseDTO> addressResponseDTOS = addressMapper.convertEntiitiesToResponseDtos(addressPage.getContent());
        pageResponseDTO.setData(addressResponseDTOS);
        return pageResponseDTO;
    }

    @Override
    @Transactional
    public Address insertAddress(InsertAddressRequestDTO requestDTO) {
        Address address= new Address();
        //address.setAddressId(requestDTO.getAddressId());
        address.setName(requestDTO.getName());
        address.setDefaultAddress(requestDTO.isDefaultAddress());
        address.setDeleted(requestDTO.isDeleted());
        address.setDistrict(requestDTO.getDistrict());
        address.setPhone(requestDTO.getPhone());
        address.setProvince(requestDTO.getProvince());
        address.setStreet(requestDTO.getStreet());
        address.setType(requestDTO.isType());
        addressRepository.save(address);
        return address;
    }

    @Override
    public AddressResponseDTO getAddressbyId(Integer id) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant get address by this id"));

        AddressResponseDTO addressResponseDTOS = addressMapper.convertEntiitiesToResponseDto(address);
        return addressResponseDTOS;
    }

    @Override
    @Transactional
    public AddressResponseDTO updateAddress(UpdateAddressRequestDTO requestDTO, Integer id) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant update address by this id"));
        address.setName(requestDTO.getName());
        address.setDefaultAddress(requestDTO.isDefaultAddress());
        address.setDeleted(requestDTO.isDeleted());
        address.setDistrict(requestDTO.getDistrict());
        address.setPhone(requestDTO.getPhone());
        address.setProvince(requestDTO.getProvince());
        address.setStreet(requestDTO.getStreet());
        address.setType(requestDTO.isType());
        addressRepository.save(address);
        AddressResponseDTO addressResponseDTO = addressMapper.convertEntiitiesToResponseDto(address);
        return addressResponseDTO;
    }

    @Override
    @Transactional
    public void deleteAddressbyId(Integer id) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant delete address by this id"));

        addressRepository.delete(address);
    }
}
