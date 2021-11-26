package com.demo;

import java.util.ArrayList;
import java.util.List;

import com.demo.pojo.Answer;
import com.demo.pojo.Question;
import com.demo.service.QuizDaoiml;

public class MainClient {

	public static void main(String[] args) {
		QuizDaoiml  quez = new QuizDaoiml();
		
		Question q1 = new Question();
		q1.setId(1212);
		q1.setQname("what is java");
		
		Answer answer1 = new Answer();
		answer1.setId(33);
		answer1.setAnswername("programming language");
		answer1.setPostedBy("java");
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(answer1);
		
		q1.setAnswers(list);
		quez.createQuestion(q1,answer1);
	      
		
		
	      
		 }
}