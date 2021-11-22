package com.demo.controller;
import com.demo.pojo.Passenger;

import com.demo.service.PassengerService;
import com.demo.repositary.PassengerRepositary;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {
	@Autowired
	private PassengerService passengerService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/passengers"))
	 public List<Passenger> getAllPassengers(){
		 
		 return passengerService.getAllPassengers();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/passengers/add"))
	public void addPassenger(@RequestBody Passenger passenger)
	{
		passengerService.addPassenger(passenger);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/passengers/{id}"))
	public void updatePassenger(@PathVariable BigInteger pnrnumber,@RequestBody Passenger passenger)
	{
		passengerService.updatePassenger(pnrnumber,passenger);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/passengers/{id}"))
	public void DeleteAirport(@PathVariable BigInteger pnrnumber)
	{
		passengerService.deletePassenger(pnrnumber);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/passengers/{id}")
	public Passenger findPassengerByPnrnumber(@PathVariable BigInteger pnrnumber) {
		return passengerService.getPassengerByPnrnumber(pnrnumber);
	}
	
	 
	 
	
}
