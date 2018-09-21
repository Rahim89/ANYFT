package com.anyft.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class TypeTransportation {
	
	@Id
	@GeneratedValue
	private String typeTranspName;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "typeLicenseName")
	private TypeLicense typeLicense;


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TypeLicense getTypeLicenseName() {
		return typeLicense;
	}

	public void setTypeLicenseName(TypeLicense typeLicenseName) {
		this.typeLicense = typeLicenseName;
	}
	
	

}
