package com.springmvc.Beans;

import java.sql.Date;

import javax.validation.constraints.NotNull;

import com.springmvc.Validator.DateConstraint;


public class Tour {
	
	@NotNull
	private int tourId;
	
	@NotNull
	private int tourPackageId;
	
	@DateConstraint
	@NotNull
	private Date tourDate;
	
	@NotNull
	private int tourTime;
	
	@NotNull
	private String pickupLocation;
	
	@NotNull
	private String dropoffLocation;
	
	@NotNull
	private int transportationId;
	
	@NotNull
	private int guideId;
	
	@NotNull
	private int driverId;
	
	@NotNull
	private double price;
	
	
	public int getTourId() {
		return tourId;
	}

	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	public int getTourPackageId() {
		return tourPackageId;
	}

	public void setTourPackageId(int tourPackageId) {
		this.tourPackageId = tourPackageId;
	}

	public Date getTourDate() {
		return tourDate;
	}

	public void setTourDate(Date tourDate) {
		this.tourDate = tourDate;
	}

	public int getTourTime() {
		return tourTime;
	}

	public void setTourTime(int tourTime) {
		this.tourTime = tourTime;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropoffLocation() {
		return dropoffLocation;
	}

	public void setDropoffLocation(String dropoffLocation) {
		this.dropoffLocation = dropoffLocation;
	}

	public int getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(int transportationId) {
		this.transportationId = transportationId;
	}

	public int getGuideId() {
		return guideId;
	}

	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
