package com.example.demo.employeeresponse;

import java.time.LocalDate;

import com.example.demo.addressresponsedto.AddressResponse;
import com.example.demo.model.Department;
import com.example.demo.model.EmploymentType;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class EmployeeResponse {
	private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private LocalDate dateOfJoining;
    @Enumerated(EnumType.STRING)
    private Department department;
    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType;
    private AddressResponse addressresponse;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public EmploymentType getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(EmploymentType employmentType) {
		this.employmentType = employmentType;
	}
	public AddressResponse getAddressresponse() {
		return addressresponse;
	}
	public void setAddressresponse(AddressResponse addressresponse) {
		this.addressresponse = addressresponse;
	}
    

}
