package com.demo;

import com.demo.pojo.Student;
import com.demo.service.StudentDaoiml;
import java.util.List;




public class MainClient {

	public static void main(String[] args) {
		
		StudentDaoiml studentDaoiml = new StudentDaoiml();
		
		// insert once record
		
		
		
		List<Student> listofstudents = studentDaoiml.getAllStudents();
		{

			for (Student stud : listofstudents) {

				String studentname = stud.getStudname();
				String age = stud.getAge();

				System.out.println(" student  name " + studentname + "student age " + age);

			}

		}
		
		
		
		
		

	}
		

		

		
		
}
