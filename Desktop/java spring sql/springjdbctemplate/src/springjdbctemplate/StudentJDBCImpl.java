package springjdbctemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCImpl  implements StudentDAO{
	
	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateoobject;


	public void setDataSoruce(DataSource ds) {
		
		this.dataSourceprop=ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);

	
		
	}

	//user deifined method and you have to write logic
	public void createStudent(String studname, String age) {
		
		String sql="insert  into student(studname,age) values(?,?)";
		
		JdbcTemplateoobject.update(sql,studname,age);
		
    	return;

		
	}
}

