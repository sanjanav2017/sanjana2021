
package springjdbctrmplate;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Userrowmapper {
	public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employe stud= new Employe();
		// mapping results in colums
		stud.setEmployeeid(rs.getInt("employeeid"));
		stud.setEmployeename(rs.getString("employeename"));
		stud.setEmployeesalary(rs.getInt("employeesalary"));
		return stud;
	}

}
