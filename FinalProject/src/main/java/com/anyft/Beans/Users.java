package com.anyft.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Users {
	
	@Id
	@OneToOne
	@JoinColumn(name ="userId")
	private Login userId;
	
	@NotEmpty(message = "FirstName required.")
	private String firstName;
	
	@NotEmpty(message = "LastName required.")
	private String lastName;
	
	@NotEmpty(message = "Address required.")
	private String address;
	
	@Email(message = "Invalid email.")
	@NotEmpty(message = "Email required.")
	private String email;
	private String phoneNo;
	 
	@NotEmpty(message = "Country required.")
	private String country;

	public Login getUserId() {
		return userId;
	}

	public void setUserId(Login userId) {
		this.userId = userId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
