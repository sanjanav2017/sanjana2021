package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.demo.dao.quizDAO;
import com.demo.pojo.Answer;
import com.demo.pojo.Question;
import com.demo.util.HibernetUtil;

public class QuizDaoiml implements quizDAO {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	public void createQuestion(Question q1,Answer answer1) {
		Transaction tx = null;
		Question questions= null;
		
		try {
		// enble the session by calling opensesion method
		sessionObj = HibernetUtil.buildSessionFactory().openSession();
		tx = sessionObj.beginTransaction();
      sessionObj.save(q1);// insert into table and formed the sql query automaticall "insert into student values(?,?)
      sessionObj.save(answer1);
      tx.commit();
      
	
		}catch(Exception e) {
			
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		 finally {
				sessionObj.close();
			}
	}




	@Override
	public void createAnswers(Answer answer1) {
		


		
	}









}
