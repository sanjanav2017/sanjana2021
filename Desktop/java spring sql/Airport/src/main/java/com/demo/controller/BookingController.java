package com.demo.controller;
import com.demo.pojo.Booking;

import com.demo.service.BookingService;
import com.demo.repositary.BookingRepositary;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/bookings"))
	 public List<Booking> getAllBookings(){
		 
		 return bookingService.getAllBookings();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/bookings/add"))
	public void addBooking(@RequestBody Booking booking)
	{
		bookingService.addBooking(booking);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/bookings/{id}"))
	public void updateBooking(@PathVariable BigInteger bookingid,@RequestBody Booking booking)
	{
		bookingService.updateBooking(bookingid,booking);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/bookings/{id}"))
	public void DeleteBooking(@PathVariable BigInteger bookingid)
	{
		bookingService.deleteBooking(bookingid);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/bookings/{id}")
	public Booking findBookingBybookingid(@PathVariable BigInteger bookingid) {
		return bookingService.getBookingBybookingid(bookingid);
	}
	
	 
	 
	
}

