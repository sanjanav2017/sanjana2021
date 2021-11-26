package com.demo.dao;

import com.demo.pojo.Answer;
import com.demo.pojo.Question;

public interface quizDAO {
	
	
	public void createQuestion(Question q1,Answer answer1);
	
	public void  createAnswers(Answer answer1);

}