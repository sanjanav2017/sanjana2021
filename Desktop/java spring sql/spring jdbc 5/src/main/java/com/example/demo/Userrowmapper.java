package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Userrowmapper implements  RowMapper<Application> {
	
	@Override
	public Application mapRow(ResultSet rs,int rowNum) throws SQLException {
		
		Application user=new Application();
		
		
		user.setId(rs.getInt("id"));
		user.setStudname(rs.getString("studname"));
		user.setStudname(rs.getString("age"));
		
		return user;
	}
	

}
