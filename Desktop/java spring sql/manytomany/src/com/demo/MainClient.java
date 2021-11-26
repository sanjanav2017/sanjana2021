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
		
		List<Answer> list1 = new ArrayList<Answer>();
		list1.add(answer1);
		List<Question> list2 = new ArrayList<Question>();
		list2.add(q1);
		
		q1.setAnswers(list1);
		answer1.setQuestions(list2);
		quez.createQuestion(q1,answer1);
	      
		
		
	      
		 }
}