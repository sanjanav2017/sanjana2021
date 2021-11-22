package com.demo.controller;
import com.demo.pojo.Schedule;

import com.demo.service.ScheduleService;
import com.demo.repositary.ScheduleRepositary;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {
	@Autowired
	private ScheduleService scheduleService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/schedule"))
	 public List<Schedule> getAllSchedules(){
		 
		 return scheduleService.getAllSchedules();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/schedule/add"))
	public void addSchedule(@RequestBody Schedule schedule)
	{
		scheduleService.addSchedule(schedule);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/schedule/{id}"))
	public void updateSchedule(@PathVariable BigInteger scheduleid,@RequestBody Schedule schedule)
	{
		scheduleService.updateSchedule(scheduleid,schedule);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/schedule/{id}"))
	public void DeleteSchedule(@PathVariable BigInteger scheduleid)
	{
		scheduleService.deleteSchedule(scheduleid);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/schedule/{id}")
	public Schedule findScheduleByscheduleid(@PathVariable BigInteger scheduleid) {
		return scheduleService.getScheduleByScheduleid(scheduleid);
	}
	
	 
	 
	
}
