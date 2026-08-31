package com.example.demowithcab.controller;
import com.example.demowithcab.service.*;
import com.example.demowithcab.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/driver")
public class DriverController {
	  @Autowired
      RideService rs;
	  @PutMapping("/start/{rideId}")
	  public Ride startri(@PathVariable int rideId)
	  {
		  return rs.startRide(rideId);
	  }
	  @PutMapping("/complete/{rideId}")
	  public Ride completeri(@PathVariable int rideId)
	  {
		  return rs.completeRide(rideId);
	  }
}
