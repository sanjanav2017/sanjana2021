package com.demo.repositary;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Schedule;
import com.demo.service.ScheduleService;
import com.demo.controller.ScheduleController;

public interface ScheduleRepositary extends CrudRepository<Schedule,BigInteger> {

}