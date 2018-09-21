package com.anyft.Beans;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class TourPackage {
	
	@Id
	@GeneratedValue
	private int tourPackageId;
	
	@NotEmpty(message = "Name required.")
	private String name;
	
	@NotEmpty(message = "Descriptions required.")
	private String descriptions;
	
	@NotEmpty(message = "Itineray Description required.")
	private String itineraryDescription;
	
	@NotEmpty(message = "Minimuim Duration required.")
	private int duration_min;
	
	@NotEmpty(message = "Maximum Duration required. ")
	private int duration_max;
	
	@NotEmpty(message = "Minimum gorup required.")
	private int group_min;
	
	@NotEmpty(message = "MAximum group required. ")
	private int group_max;
	
	@OneToMany
	@JoinColumn(name = "transportationId")
	private Transportation transportationId;
	
	@NotEmpty(message = "Price required. ")
	private double price;
	@NotEmpty(message = "Type of tour required.")
	public String privates;
	
	@NotEmpty(message = "Minimun size of the private tour required.")
	private int privateSize_min;
	
	@NotEmpty(message = "Maximum size of the private tour required.")
	private int privateSize_max;
	
	@NotEmpty(message = "Type of tour required.")
	private String publics;
	
	@NotEmpty(message = "Minimun size of the public tour required.")
	private int publiceSize_min;
	
	@NotEmpty(message = "Maximum size of the public tour required.")
	private int publicSize_max;

	public int getTourPackageId() {
		return tourPackageId;
	}

	public void setTourPackageId(int tourPackageId) {
		this.tourPackageId = tourPackageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getItineraryDescription() {
		return itineraryDescription;
	}

	public void setItineraryDescription(String itineraryDescription) {
		this.itineraryDescription = itineraryDescription;
	}

	public int getDuration_min() {
		return duration_min;
	}

	public void setDuration_min(int duration_min) {
		this.duration_min = duration_min;
	}

	public int getDuration_max() {
		return duration_max;
	}

	public void setDuration_max(int duration_max) {
		this.duration_max = duration_max;
	}

	public int getGroup_min() {
		return group_min;
	}

	public void setGroup_min(int group_min) {
		this.group_min = group_min;
	}

	public int getGroup_max() {
		return group_max;
	}

	public void setGroup_max(int group_max) {
		this.group_max = group_max;
	}

	public Transportation getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(Transportation transportationId) {
		this.transportationId = transportationId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPrivates() {
		return privates;
	}

	public void setPrivates(String privates) {
		this.privates = privates;
	}

	public int getPrivateSize_min() {
		return privateSize_min;
	}

	public void setPrivateSize_min(int privateSize_min) {
		this.privateSize_min = privateSize_min;
	}

	public int getPrivateSize_max() {
		return privateSize_max;
	}

	public void setPrivateSize_max(int privateSize_max) {
		this.privateSize_max = privateSize_max;
	}

	public String getPublics() {
		return publics;
	}

	public void setPublics(String publics) {
		this.publics = publics;
	}

	public int getPubliceSize_min() {
		return publiceSize_min;
	}

	public void setPubliceSize_min(int publiceSize_min) {
		this.publiceSize_min = publiceSize_min;
	}

	public int getPublicSize_max() {
		return publicSize_max;
	}

	public void setPublicSize_max(int publicSize_max) {
		this.publicSize_max = publicSize_max;
	}
	
	

}
