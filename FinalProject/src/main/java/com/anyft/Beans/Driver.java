package com.anyft.Beans;



import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Driver {
	
	@Id
	@GeneratedValue
	private int driverId;
	
	@NotEmpty(message = "First Name required.")
	private String driverFirstName;
	
	@NotEmpty(message = "Last Name required.")
	private String driverLastName;
	
	@NotEmpty(message = "D.O.B required.")
	private Date dob;
	
	@NotEmpty(message = "Phone Number required.")
	private String phoneNo;
	
	@NotEmpty(message = "Address required.")
	private String address;
	
	@Email(message = "Invalid email.")
	@NotEmpty(message = "Email required.")
	private String email;

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverFirstName() {
		return driverFirstName;
	}

	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}

	public String getDriverLastName() {
		return driverLastName;
	}

	public void setDriverLastName(String driverLastName) {
		this.driverLastName = driverLastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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
	
	
	

}
