package com.example.demo.response;

public class AddressResponse {
	
	private int EmployeeAdressid;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    private int employeeid;
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
