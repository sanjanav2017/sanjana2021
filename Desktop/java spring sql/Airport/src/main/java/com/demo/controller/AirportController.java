package com.demo.controller;
import com.demo.pojo.Airport;

import com.demo.service.AirportService;
import com.demo.repositary.AirportRepositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirportController {
	@Autowired
	private AirportService airportService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/airports"))
	 public List<Airport> getAllAirports(){
		 
		 return airportService.getAllAirports();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/airports/add"))
	public void addBilling(@RequestBody Airport airport)
	{
		airportService.addAirport(airport);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/airports/{id}"))
	public void updateAirport(@PathVariable Integer airportcode,@RequestBody Airport airport)
	{
		airportService.updateAirport(airportcode,airport);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/airports/{id}"))
	public void DeleteAirport(@PathVariable Integer airportcode)
	{
		airportService.deleteAirport(airportcode);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/airports/{id}")
	public Airport findAirportByAirportcode(@PathVariable Integer airportcode) {
		return airportService.getAirportByAirportcode(airportcode);
	}
	
	 
	 
	
}
