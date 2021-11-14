package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private Application user;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		this.readUserVer1();
		
	}
	
	
	public void readUserVer1() {
		String sql="SELECT * FROM student WHERE id=?";
		
		@SuppressWarnings("deprecation")
		Application user =(Application) jdbcTemplate.queryForObject(sql,new Object[] {10}, new Userrowmapper());
		
		System.out.println(user);
	}

	

}
