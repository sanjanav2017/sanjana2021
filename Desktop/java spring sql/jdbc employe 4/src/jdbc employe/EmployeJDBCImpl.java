package springjdbctrmplate;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeJDBCImpl implements EmployeDAO {
	
	
	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateoobject;


	public void setDataSoruce(DataSource ds) {
		
		this.dataSourceprop=ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);

	
		
	}
	//user deifined method and you have to write logic
	public void insertemploye(Integer employeeid,String employeename,Integer employeesalary) {
		
		String sql="insert  into employee(employeeid,employeename,employeesalary) values(?,?,?)" ;
		
		
		JdbcTemplateoobject.update(sql,employeeid,employeename,employeesalary);
		
    	return ;

		
	}
}


	