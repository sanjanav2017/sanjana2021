package com.demo.service;

import java.math.BigInteger;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.ScheduleRepositary;
import com.demo.repositary.ScheduleRepositary;
import com.demo.pojo.Schedule;

import com.demo.controller.ScheduleController;

@Service
public class ScheduleService {
	@Autowired
	public ScheduleRepositary scheduleRepo;
	 public List<Schedule> getAllSchedules(){
		 
		 List<Schedule>schedules=new ArrayList<>();
		 scheduleRepo.findAll().forEach(schedules::add);
		 return schedules; 

}
	 public void addSchedule(Schedule schedule) {
		    scheduleRepo.save(schedule);
	 }
	 public void updateSchedule(BigInteger scheduleid,Schedule schedule) {
		    scheduleRepo.save(schedule);
	 }
	 public void deleteSchedule(BigInteger scheduleid) {
		    scheduleRepo.deleteById(scheduleid);
	 }
	 public Schedule getScheduleByScheduleid(BigInteger scheduleid) {
			return scheduleRepo.findById(scheduleid).orElse(null);
	 }
}
			
			