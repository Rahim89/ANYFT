package com.anyft.Beans;



import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Tour {
	
	@Id
	@GeneratedValue
	private int tourId;
	@ManyToOne
	@JoinColumn(name = "tourPackageId")
	private TourPackage tourPackageId;
	
	@NotEmpty( message = "Date required.")
	private Date tourDate;
	
	@NotEmpty(message = "Time required.")
	private int tourTime;
	
	@NotEmpty(message ="PickUp Location required.")
	private String pickupLocation;
	
	@NotEmpty(message = "Drop Off Location required.")
	private String dropoffLocation;
	
	@ManyToOne
	@JoinColumn(name = "transportationId")
	private Transportation transportationId;
	
	@ManyToOne
	@JoinColumn(name = "guideId")
	private Guide guideId;
	
	@ManyToOne
	@JoinColumn(name = "driverId")
	private Driver driverId;
	
	@NotEmpty(message = "Price required.")
	private double price;

	public int getTourId() {
		return tourId;
	}

	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	public TourPackage getTourPackageId() {
		return tourPackageId;
	}

	public void setTourPackageId(TourPackage tourPackageId) {
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

	public Transportation getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(Transportation transportationId) {
		this.transportationId = transportationId;
	}

	public Guide getGuideId() {
		return guideId;
	}

	public void setGuideId(Guide guideId) {
		this.guideId = guideId;
	}

	public Driver getDriverId() {
		return driverId;
	}

	public void setDriverId(Driver driverId) {
		this.driverId = driverId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
