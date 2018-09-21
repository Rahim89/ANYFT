package com.anyft.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Guide {
	
	@Id
	@GeneratedValue
	private int guideId;
	
	@NotEmpty(message = "FirstName required.")
	private String firstName;
	
	@NotEmpty(message = "LastName required.")
	private String lastName;
	
	@NotEmpty(message = "Address required.")
	private String address;
	
	@NotEmpty(message = "Phone number required.")
	private String phoneNo;
	
	@Email(message = "Invalid email.")
	@NotEmpty(message = "Email required.")
	private String email;
	
	@NotEmpty(message = "Language required.")
	private String language;
	
	@NotEmpty(message = "Experience required.")
	private int experience;

	public int getGuideId() {
		return guideId;
	}

	public void setGuideId(int guideId) {
		this.guideId = guideId;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	

}
