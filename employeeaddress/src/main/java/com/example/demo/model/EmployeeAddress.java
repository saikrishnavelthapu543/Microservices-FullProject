package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeAddress {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int EmployeeAdressid;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    private int employeeid;
    public EmployeeAddress() {
		super();
	}
	
	public EmployeeAddress(int employeeAdressid, String street, String city, String state, String country,
			String zipcode, int employeeid) {
		super();
		EmployeeAdressid = employeeAdressid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.employeeid = employeeid;
		
	}

	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getEmployeeAdressid() {
		return EmployeeAdressid;
	}
	public void setEmployeeAdressid(int employeeAdressid) {
		EmployeeAdressid = employeeAdressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	

}
