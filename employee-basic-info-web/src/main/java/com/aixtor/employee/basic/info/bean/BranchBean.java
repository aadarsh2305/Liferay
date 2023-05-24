package com.aixtor.employee.basic.info.bean;

public class BranchBean {
	long id;
	String name;
	String address1;
	String address2;
	String country;
	String state;
	String city;
	long pincode;
	

	public BranchBean() {
		super();
	}
	public BranchBean(long id, String name, String address1, String address2, String country, String state, String city,
			long pincode) {
		super();
		this.id = id;
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	
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
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "BranchBean [id=" + id + ", name=" + name + ", address1=" + address1 + ", address2=" + address2
				+ ", country=" + country + ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
