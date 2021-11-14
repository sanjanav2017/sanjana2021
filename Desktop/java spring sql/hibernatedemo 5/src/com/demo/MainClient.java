package com.demo;

import com.demo.pojo.Student;
import com.demo.service.StudentDaoiml;
import java.util.List;




public class MainClient {

	public static void main(String[] args) {
		
		StudentDaoiml studentDaoiml = new StudentDaoiml();
		
		// insert once record
		
		
		
		Student studt=studentDaoiml.getStudent(1);
		System.out.println(studt.getStudname());
				
		
		
		
		

	}
		

		

		
		
}
