package com.example.demo.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeAddress;
import com.example.demo.repository.AddressRepo;
import com.example.demo.response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressrepo;
	@Autowired
	private ModelMapper modelmapper;
	
	public AddressResponse getaddressbyeid(int employeeid) {
		
	 Optional<EmployeeAddress> employeaddress=	Optional.of(addressrepo.findByEmployeeid(employeeid));
	 EmployeeAddress address=employeaddress.get();
	 AddressResponse addressresponse= modelmapper.map(address, AddressResponse.class);
		return addressresponse;
	}

	public String create(AddressResponse addressresponse) {
		
		EmployeeAddress employeeaddress= modelmapper.map(addressresponse, EmployeeAddress.class);
		   addressrepo.save(employeeaddress);
		   return "saved";
		
	
	}

}
