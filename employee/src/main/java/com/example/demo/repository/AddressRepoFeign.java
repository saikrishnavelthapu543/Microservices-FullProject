package com.example.demo.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@FeignClient(name="employeeaddress")
public interface AddressRepoFeign {
	
	@GetMapping("getaddressbyid/{employeeid}")
	 com.example.demo.addressresponsedto.AddressResponse getaddressbyeid(@PathVariable int employeeid);
	
	@PostMapping("EmployeeAddress")
	 String create(@RequestBody com.example.demo.addressresponsedto.AddressResponse addressresponse);

}

