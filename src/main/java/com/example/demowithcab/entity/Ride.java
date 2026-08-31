package com.example.demowithcab.entity;

import jakarta.persistence.*;

@Entity
public class Ride {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String pickupLocation;
	String dropLocation;
	@ManyToOne
	User passanger;
	@ManyToOne
	User driver;
	@Enumerated(EnumType.STRING)
	RideStatus status;
	int Fare;
	public Ride() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ride(String pickupLocation, String dropLocation, User passanger, User driver, RideStatus status, int fare) {
		super();
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.passanger = passanger;
		this.driver = driver;
		this.status = status;
		Fare = fare;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public User getPassanger() {
		return passanger;
	}
	public void setPassanger(User passanger) {
		this.passanger = passanger;
	}
	public User getDriver() {
		return driver;
	}
	public void setDriver(User driver) {
		this.driver = driver;
	}
	public RideStatus getStatus() {
		return status;
	}
	public void setStatus(RideStatus status) {
		this.status = status;
	}
	public int getFare() {
		return Fare;
	}
	public void setFare(int fare) {
		Fare = fare;
	}
	

}
