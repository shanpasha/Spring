package com.bean;

public class Address {
	String city;
	String location;
	
	
	public Address(String city, String location) {
		super();
		this.city = city;
		this.location = location;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", location=" + location + "]";
	}



	
}
