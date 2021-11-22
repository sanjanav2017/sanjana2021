package com.demo.service;

import java.math.BigInteger;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.BookingRepositary;
import com.demo.pojo.Booking;

import com.demo.controller.BookingController;

@Service
public class BookingService {
	@Autowired
	public BookingRepositary bookingRepo;
	 public List<Booking> getAllBookings(){
		 
		 List<Booking>bookings=new ArrayList<>();
		 bookingRepo.findAll().forEach(bookings::add);
		 return bookings; 

}
	 public void addBooking(Booking booking) {
		    bookingRepo.save(booking);
	 }
	 public void updateBooking(BigInteger bookingid,Booking booking) {
		    bookingRepo.save(booking);
	 }
	 public void deleteBooking(BigInteger bookingid) {
		    bookingRepo.deleteById(bookingid);
	 }
	 public Booking getBookingBybookingid(BigInteger bookingid) {
			return bookingRepo.findById(bookingid).orElse(null);
			
			
			
	}
		
}






