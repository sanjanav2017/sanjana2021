package com.demo.controller;
import com.demo.pojo.Scheduledflight;

import com.demo.service.ScheduledflightService;
import com.demo.repositary.ScheduledflightRepositary;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduledflightController {
	@Autowired
	private ScheduledflightService scheduledflightService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/scheduledflights"))
	 public List<Scheduledflight> getAllScheduledflights(){
		 
		 return scheduledflightService.getAllScheduledflights();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/scheduledflights/add"))
	public void addScheduledflight(@RequestBody Scheduledflight scheduledflight)
	{
		scheduledflightService.addScheduledflight(scheduledflight);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/scheduledflights/{id}"))
	public void updateScheduledflight(@PathVariable BigInteger scheduledflightid,@RequestBody Scheduledflight scheduledflight)
	{
		scheduledflightService.updateScheduledflight(scheduledflightid,scheduledflight);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/scheduledflights/{id}"))
	public void DeleteScheduledflight(@PathVariable BigInteger scheduledflightid)
	{
		scheduledflightService.deleteScheduledflight(scheduledflightid);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/scheduledflights/{id}")
	public Scheduledflight findScheduledflightrByscheduledflightid(@PathVariable BigInteger scheduledflightid) {
		return scheduledflightService.getScheduledflightByScheduledflightid(scheduledflightid);
	}
	
	 
	 
	
}
