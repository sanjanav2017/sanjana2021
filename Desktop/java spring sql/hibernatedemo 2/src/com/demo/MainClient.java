package com.demo;

import com.demo.pojo.Student;
import com.demo.service.StudentDaoiml;

public class MainClient {

	public static void main(String[] args) {
		
		StudentDaoiml studentDaoiml = new StudentDaoiml();
		Student stude = new Student();
		// insert once record
		stude.setId(101);
		stude.setStudname("apple");
		stude.setAge("23");
		studentDaoiml.updateStudent(stude);
		
		System.out.println("  done....");
	
	}

}