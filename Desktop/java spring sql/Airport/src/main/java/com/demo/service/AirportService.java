package com.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.AirportRepositary;
import com.demo.pojo.Airport;

import com.demo.controller.AirportController;

@Service
public class AirportService {
	@Autowired
	public AirportRepositary airportRepo;
	 public List<Airport> getAllAirports(){
		 
		 List<Airport>airports=new ArrayList<>();
		 airportRepo.findAll().forEach(airports::add);
		 return airports; 

}
	 public void addAirport(Airport airport) {
		    airportRepo.save(airport);
	 }
	 public void updateAirport(Integer airportcode,Airport airport) {
		    airportRepo.save(airport);
	 }
	 public void deleteAirport(Integer airportcode) {
		    airportRepo.deleteById(airportcode);
	 }
	 public Airport getAirportByAirportcode(Integer airportcode) {
			return airportRepo.findById(airportcode).orElse(null);
			
			
			
	}
		
}






