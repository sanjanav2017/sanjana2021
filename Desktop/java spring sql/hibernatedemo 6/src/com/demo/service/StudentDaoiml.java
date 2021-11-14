package com.demo.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.StudentDAO;
import com.demo.pojo.Student;
import com.demo.util.HibernetUtil;

public class StudentDaoiml implements StudentDAO {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;
	 
	
	
	@Override
	public List<Student> getAllStudents() {

		Transaction tx = null;
		List<Student> students=null;
		
		
		try {
		// enbble the session by calling opensesion method
		sessionObj = HibernetUtil.buildSessionFactory().openSession();
		tx = sessionObj.beginTransaction();

		students=(List<Student>) sessionObj.createQuery("from Student").list();// insert into table and formed the sql query automaticall "insert into student values(?,?)
		tx.commit();
	
		}catch(Exception e) {
			
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		 finally {
				sessionObj.close();
			}
		
		return students;

	}
	

}