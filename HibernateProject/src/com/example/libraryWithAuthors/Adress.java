package com.example.libraryWithAuthors;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	
	@Column(name = "STREET_NAME")
	private String street;
	@Column(name = "PINCODE_NAME")
	private int pincode;
	@Column(name = "CITY_NAME")
	private String city;
	@Column(name = "STATE_NAME")
	private String state;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
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
	
	

}
