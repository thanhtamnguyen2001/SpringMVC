package r2s.com.ntt.lab04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import r2s.com.demo.lab04.dto.request.InsertAddressRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateAddressRequestDTO;
import r2s.com.demo.lab04.dto.request.UpdateAddressRequestDTO;
import r2s.com.demo.lab04.dto.response.AddressResponseDTO;
import r2s.com.demo.lab04.dto.response.PageResponseDTO;
import r2s.com.demo.lab04.dto.response.AddressResponseDTO;
import r2s.com.demo.lab04.entity.Address;
import r2s.com.demo.lab04.service.AddressService;

import java.util.List;

@RestController()
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    private AddressService addressService;


    @GetMapping
    public ResponseEntity<?> getAddressPaging() {
        PageResponseDTO pageResponseDTO = addressService.getAddressPaging();
        return new ResponseEntity<>(pageResponseDTO, HttpStatus.OK);
    }
    
    @GetMapping("/{address-id}")
    public ResponseEntity<?> getAddressById(@PathVariable(value = "address-id") int addressId) {
        AddressResponseDTO AddressResponseDTO = addressService.getAddressbyId(addressId);
        return new ResponseEntity<>(AddressResponseDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity insertAddress(@RequestBody InsertAddressRequestDTO requestDTO) {
        Address address = addressService.insertAddress(requestDTO);
        return new ResponseEntity(address, HttpStatus.OK);
    }

    @PutMapping("/{address-id}")
    public ResponseEntity updateAddress(@PathVariable(value = "address-id") int addressId,
                                     @RequestBody UpdateAddressRequestDTO updateAddressRequestDTO) {
        AddressResponseDTO response = addressService.updateAddress(updateAddressRequestDTO, addressId);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @DeleteMapping("/{address-id}")
    public ResponseEntity deleteAddress(@PathVariable(value = "address-id") int addressId) {
        addressService.deleteAddressbyId(addressId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
