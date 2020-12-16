package com.springbootrestapplication.model;

public class Customer {

	private long id; 

	private String name; 

	private String address; 

	private long phoneNumber; 

	private String email; 

	public long getId() { 

	return id; 

	} 

	public void setId(long id) { 

	this.id = id; 

	} 

	public String getName() { 

	return name; 

	} 

	public void setName(String name) { 

	this.name = name; 

	} 

	public String getAddress() { 

	return address; 

	} 

	public void setAddress(String address) { 

	this.address = address; 

	} 

	public long getPhoneNumber() { 

	return phoneNumber; 

	} 

	public void setPhoneNumber(long phoneNumber) { 

	this.phoneNumber = phoneNumber; 

	} 

	public String getEmail() { 

	return email; 

	} 

	public void setEmail(String email) { 

	this.email = email; 

	} 

	@Override 

	public String toString() { 

	return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber 

	+ ", email=" + email + "]"; 

	} 
	
}
