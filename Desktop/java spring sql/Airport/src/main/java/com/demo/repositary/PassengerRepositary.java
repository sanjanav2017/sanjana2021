package com.demo.repositary;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Passenger;
import com.demo.service.PassengerService;
import com.demo.controller.PassengerController;

public interface PassengerRepositary extends CrudRepository<Passenger,BigInteger> {

}