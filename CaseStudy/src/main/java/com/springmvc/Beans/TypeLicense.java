package com.springmvc.Beans;



public class TypeLicense {
	
	
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

	@Override
	public String toString() {
		return "TypeLicense [typelicenseName=" + typelicenseName + ", description=" + description + "]";
	}
	
	

}
