package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmployeeAddress;
import com.example.demo.response.AddressResponse;

@Repository
public interface AddressRepo extends JpaRepository<EmployeeAddress, Integer>{
	
	  EmployeeAddress findByEmployeeid(int employeeid);


}
