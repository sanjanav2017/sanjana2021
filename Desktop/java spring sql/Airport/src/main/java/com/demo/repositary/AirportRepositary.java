package com.demo.repositary;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Airport;
import com.demo.service.AirportService;
import com.demo.controller.AirportController;

public interface AirportRepositary extends CrudRepository<Airport,Integer> {

}