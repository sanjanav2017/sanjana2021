package springjdbctrmplate;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeJDBCImpl implements EmplyeDAO {
	
	
	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateoobject;


	public void setDataSoruce(DataSource ds) {
		
		this.dataSourceprop=ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);

	
		
	}
	//user deifined method and you have to write logic
	public List<Employe> listAllEmployes() {
		
		 List<Employe> employelist = new ArrayList<Employe>();
		 
		 String employelistsql="select * from employee";
		 
		  // any of else can be used
	//	 employelist = JdbcTemplateoobject.query(studentlistsql,new EmployeJbdcRowMapper(Employe.class));
		 
		 employelist = JdbcTemplateoobject.query(Employelistsql,new BeanPropertyRowMapper(Employe.class));
		 
	
		return employelist;
	}

		
	}





	