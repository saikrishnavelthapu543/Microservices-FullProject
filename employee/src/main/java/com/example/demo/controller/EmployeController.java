package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employeeresponse.EmployeeResponse;
import com.example.demo.service.EmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	private EmployeService employeservice;
	
	@GetMapping("getemployeebyid/{id}")
	public EmployeeResponse getemployeebyid(@PathVariable  int id)
	{
		return  employeservice.getemployeebyid(id);
		
	}
	
	@PostMapping("Employee")
	public String createEmployee(@RequestBody EmployeeResponse employeeresponse)
	{
		return employeservice.createEmployee(employeeresponse);
	}

}
