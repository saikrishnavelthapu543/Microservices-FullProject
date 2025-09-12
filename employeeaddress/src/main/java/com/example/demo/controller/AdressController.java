package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.response.AddressResponse;
import com.example.demo.service.AddressService;




@RestController
public class AdressController {
	
    @Autowired
    private AddressService addresservice;

    @GetMapping("getaddressbyid/{employeeid}")
    public AddressResponse getaddressbyeid(@PathVariable int employeeid) {
        return addresservice.getaddressbyeid(employeeid);
    }

    @PostMapping("EmployeeAddress")
    public String create(@RequestBody AddressResponse addressresponse) {
        return addresservice.create(addressresponse);
    }


}
