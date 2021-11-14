package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jdbctemplate;

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
		String sql="SELECT * FROM student";
		List<Map<String,Object>> list=jdbctemplate.queryForList(sql);
		System.out.println(list);
		
	}

}
