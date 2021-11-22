package com.demo.repositary;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Booking;
import com.demo.service.BookingService;
import com.demo.controller.BookingController;

public interface BookingRepositary extends CrudRepository<Booking,BigInteger> {

}