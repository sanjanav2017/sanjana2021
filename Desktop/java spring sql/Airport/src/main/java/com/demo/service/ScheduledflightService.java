package com.demo.service;

import java.math.BigInteger;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.PassengerRepositary;
import com.demo.repositary.ScheduledflightRepositary;
import com.demo.pojo.Scheduledflight;

import com.demo.controller.ScheduledflightController;

@Service
public class ScheduledflightService {
	@Autowired
	public ScheduledflightRepositary scheduledflightRepo;
	 public List<Scheduledflight> getAllScheduledflights(){
		 
		 List<Scheduledflight>scheduledflights=new ArrayList<>();
		 scheduledflightRepo.findAll().forEach(scheduledflights::add);
		 return scheduledflights; 

}
	 public void addScheduledflight(Scheduledflight scheduledflight) {
		    scheduledflightRepo.save(scheduledflight);
	 }
	 public void updateScheduledflight(BigInteger scheduledflightid,Scheduledflight scheduledflight) {
		    scheduledflightRepo.save(scheduledflight);
	 }
	 public void deleteScheduledflight(BigInteger scheduledflightid) {
		    scheduledflightRepo.deleteById(scheduledflightid);
	 }
	 public Scheduledflight getScheduledflightByScheduledflightid(BigInteger scheduledflightid) {
			return scheduledflightRepo.findById(scheduledflightid).orElse(null);
	 }
}
			
			