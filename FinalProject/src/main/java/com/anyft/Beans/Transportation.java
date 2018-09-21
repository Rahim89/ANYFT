package com.anyft.Beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;


@Entity
public class Transportation {
	
	@Id
	@GeneratedValue
	private int transportationId;
	
	@NotEmpty(message = "Transportation Name required.")
	private String transportationName;
	
	@NotEmpty(message = "Capacity required.")
	private int transportationCapacity;
	
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "typeTranspName")
	private TypeTransportation typeTranspName;

	public int getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(int transportationId) {
		this.transportationId = transportationId;
	}

	public String getTransportationName() {
		return transportationName;
	}

	public void setTransportationName(String transportationName) {
		this.transportationName = transportationName;
	}

	public int getTransportationCapacity() {
		return transportationCapacity;
	}

	public void setTransportationCapacity(int transportationCapacity) {
		this.transportationCapacity = transportationCapacity;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public TypeTransportation getTypeTranspName() {
		return typeTranspName;
	}

	public void setTypeTranspName(TypeTransportation typeTranspName) {
		this.typeTranspName = typeTranspName;
	}
	
	

}
