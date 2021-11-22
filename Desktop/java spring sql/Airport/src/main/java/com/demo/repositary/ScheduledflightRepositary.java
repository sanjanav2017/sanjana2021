package com.demo.repositary;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Scheduledflight;
import com.demo.service.ScheduledflightService;
import com.demo.controller.ScheduledflightController;

public interface ScheduledflightRepositary extends CrudRepository<Scheduledflight,BigInteger> {

}