package com.springmvc.Beans;

import javax.validation.constraints.NotNull;

public class TourPackage {
	
	@NotNull
	private int tourPackageId;
	
	@NotNull
	private String name;
	
	
	private String descriptions;
	
	@NotNull
	private String itineraryDescription;
	
	@NotNull
	private int duration_min;
	
	@NotNull
	private int duration_max;
	
	@NotNull
	private int group_min;
	
	@NotNull
	private int group_max;
	
	@NotNull
	private int transportationId;
	
	
	private double price;
	
	public String privates;
	
	
	private int privateSize_min;
	
	
	private int privateSize_max;
	
	
	private String publics;
	
	
	private int publiceSize_min;
	
	
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

	public int getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(int transportationId) {
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

	@Override
	public String toString() {
		return "TourPackage [tourPackageId=" + tourPackageId + ", name=" + name + ", descriptions=" + descriptions
				+ ", itineraryDescription=" + itineraryDescription + ", duration_min=" + duration_min
				+ ", duration_max=" + duration_max + ", group_min=" + group_min + ", group_max=" + group_max
				+ ", transportationId=" + transportationId + ", price=" + price + ", privates=" + privates
				+ ", privateSize_min=" + privateSize_min + ", privateSize_max=" + privateSize_max + ", publics="
				+ publics + ", publiceSize_min=" + publiceSize_min + ", publicSize_max=" + publicSize_max + "]";
	}
	

}
