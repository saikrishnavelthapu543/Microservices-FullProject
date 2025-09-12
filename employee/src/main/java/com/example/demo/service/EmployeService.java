package com.example.demo.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.addressresponsedto.AddressResponse;
import com.example.demo.employeeresponse.EmployeeResponse;
import com.example.demo.model.Employee;
import com.example.demo.repository.AddressRepoFeign;
import com.example.demo.repository.EmployeRepo;

@Service
public class EmployeService {
	
	@Autowired
	private EmployeRepo employerepo;
	@Autowired
	private AddressRepoFeign addressrepofeign;
	@Autowired
	private ModelMapper modelmapper;
	public EmployeeResponse getemployeebyid(int id) {
		Optional<Employee> employeopt= employerepo.findById(id);
		Employee employee=employeopt.get();
		
		AddressResponse addressresponse= addressrepofeign.getaddressbyeid(id);
		
		 EmployeeResponse employeresponse= modelmapper.map(employee,EmployeeResponse.class);
		 employeresponse.setAddressresponse(addressresponse);
		return employeresponse;
	}
	public String createEmployee(EmployeeResponse employeeresponse) {
		
//		Employee employee=new Employee();
//		employee.setId(employeeresponse.getId());
//		employee.setDateOfJoining(employeeresponse.getDateOfJoining());
//		employee.setDepartment(employeeresponse.getDepartment());
//		employee.setEmail(employeeresponse.getEmail());
//		employee.setEmploymentType(employeeresponse.getEmploymentType());
//		employee.setFirstName(employeeresponse.getFirstName());
//		employee.setLastName(employeeresponse.getLastName());
//		employee.setMobileNumber(employeeresponse.getMobileNumber());
//		AddressResponse addressresponse=new AddressResponse();
//		addressresponse.setCity(employeeresponse.getAddressresponse().getCity());
//		addressresponse.setCountry(employeeresponse.getAddressresponse().getCountry());
//		addressresponse.setState(employeeresponse.getAddressresponse().getState());
//		addressresponse.setStreet(employeeresponse.getAddressresponse().getStreet());
//		addressresponse.setZipcode(employeeresponse.getAddressresponse().getZipcode());
//		addressresponse.setEmployeeid(employeeresponse.getId());
//		addressrepofeign.create(addressresponse);
//		employerepo.save(employee);
		
		 Employee employee = modelmapper.map(employeeresponse, Employee.class);
		 AddressResponse addressResponse = modelmapper.map(employeeresponse.getAddressresponse(), AddressResponse.class);
		 addressResponse.setEmployeeid(employeeresponse.getId()); 
		 addressrepofeign.create(addressResponse);
		 employerepo.save(employee);
		return "saved successfully";
	}

}
