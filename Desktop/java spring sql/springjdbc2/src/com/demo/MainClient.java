package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentJDBCImpl studentJDBCImpl = (StudentJDBCImpl)context.getBean("studentdao");
		
		System.out.println("recored creation..");
		
		studentJDBCImpl.deleteStudentById("2");
		
		
		
		System.out.println("done.......");

		

}
}
