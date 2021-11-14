package springjdbctrmplate;

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
	public void deleteStudentById(Integer id) {
		
		String sql="DELETE FROM student WHERE id=?";
		
		JdbcTemplateoobject.update(sql,id);
		
    	return;

		
	}
}


	