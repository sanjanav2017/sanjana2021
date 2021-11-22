package com.demo.service;

import java.math.BigInteger;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.PassengerRepositary;
import com.demo.pojo.Passenger;

import com.demo.controller.PassengerController;

@Service
public class PassengerService {
	@Autowired
	public PassengerRepositary passengerRepo;
	 public List<Passenger> getAllPassengers(){
		 
		 List<Passenger>passengers=new ArrayList<>();
		 passengerRepo.findAll().forEach(passengers::add);
		 return passengers; 

}
	 public void addPassenger(Passenger passenger) {
		    passengerRepo.save(passenger);
	 }
	 public void updatePassenger(BigInteger pnrnumber,Passenger passenger) {
		    passengerRepo.save(passenger);
	 }
	 public void deletePassenger(BigInteger pnrnumber) {
		    passengerRepo.deleteById(pnrnumber);
	 }
	 public Passenger getPassengerByPnrnumber(BigInteger pnrnumber) {
			return passengerRepo.findById(pnrnumber).orElse(null);
			
			
			
	}
		
}






