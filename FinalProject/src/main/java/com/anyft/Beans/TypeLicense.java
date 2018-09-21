package com.anyft.Beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TypeLicense {
	
	@Id
	private String typelicenseName;
	
	private String description;

	public String getTypelicenseName() {
		return typelicenseName;
	}

	public void setTypelicenseName(String typelicenseName) {
		this.typelicenseName = typelicenseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
