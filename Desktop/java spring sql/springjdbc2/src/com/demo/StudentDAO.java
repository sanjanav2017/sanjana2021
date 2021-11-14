package com.demo;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	
	// looking for data soruce like mysql db
	public void setDataSoruce(DataSource ds);
	
	// insert records for student
		
	public void deleteStudentById(String id);
	
}
	