package com.springmvc.Beans;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import com.springmvc.Validator.EmailConstraint;
import com.springmvc.Validator.PhoneConstraint;



public class Driver {

	@NotNull
	private int driverId;
	
	@NotNull
	private String driverFirstName;
	
	@NotNull
	private String driverLastName;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
    @NotNull @Past
	private Date dob;
	
	@PhoneConstraint
	private String phoneNo;
	
	@NotNull
	private String address;
	
	@EmailConstraint
	@NotNull
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
