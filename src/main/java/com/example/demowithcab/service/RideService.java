package com.example.demowithcab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demowithcab.dao.*;
import com.example.demowithcab.dto.RideRequest;
import com.example.demowithcab.entity.*;

@Service
public class RideService {

	@Autowired
	RideRepo r1;
	@Autowired
	UserRepo r2;
	
	public Ride requestride(int passangerId,RideRequest request)
	{
		Ride ride=new Ride();
		ride.setPassanger(
				r2.findById(passangerId).get());
				ride.setPickupLocation(request.getPickup());
				ride.setDropLocation(request.getDrop());
				ride.setStatus(RideStatus.REQUESTED);
				ride.setFare(100);
				return r1.save(ride);
		
	}
	public Ride assignDriver(int rideId,int driverId)
	{
		Ride ride=r1.findById(rideId).get();
		User driver=r2.findById(driverId).get();
		ride.setDriver(driver);
		ride.setStatus(RideStatus.ACCEPTED);
		return r1.save(ride);
	}
	public Ride startRide(int rideId)
	{
		Ride ride=r1.findById(rideId).get();
		ride.setStatus(RideStatus.STARTED);
		return r1.save(ride);
	}
	public Ride completeRide(int rideId)
	{
		Ride ride=r1.findById(rideId).get();
		ride.setStatus(RideStatus.COMPLETED);
		return r1.save(ride);
	}
	
}