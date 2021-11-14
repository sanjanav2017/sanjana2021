package springjdbctrmplate;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeDAO {
	
	// looking for data soruce like mysql db
	public void setDataSoruce(DataSource ds);
	
	// insert records for student
	public void updateemploye( Integer id,String name,Integer salary);
	
}