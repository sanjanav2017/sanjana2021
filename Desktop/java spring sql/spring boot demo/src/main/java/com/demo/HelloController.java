
package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// this is call endpoint url   api test
    @RequestMapping(value="/getName",method=RequestMethod.GET)
    public String getName() {
    	 return "Welcome";
    }
}