
package com.ntt.lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ntt.lab3.dto.request.InsertAddressRequestDTO;
import com.ntt.lab3.entity.Address;
import com.ntt.lab3.service.AddressService;

import java.util.List;

@RestController()
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public ResponseEntity<?> getAllAddress() {
        List<Address> addressList = addressService.getAllAddressDatabase();
        return new ResponseEntity(addressList, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity insertAddress(@RequestBody InsertAddressRequestDTO requestDTO) {
        Address address = addressService.insertAddress(requestDTO);
        return new ResponseEntity(address, HttpStatus.OK);
    }

}
