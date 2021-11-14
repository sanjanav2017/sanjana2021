package com.demo;

import com.demo.pojo.Student;
import com.demo.service.StudentDaoiml;
import java.util.List;




public class MainClient {

	public static void main(String[] args) {
		
		StudentDaoiml studentDaoiml = new StudentDaoiml();
		
		// insert once record
		
		
		
		Student student = new Student();

		student.setId(6);// update the details on the bases of id
		student.setStudname("rabbit");
		student.setAge("30");

		studentDaoiml.deleteStudent(student);
		
		
		
		

	}
		

		

		
		
}
