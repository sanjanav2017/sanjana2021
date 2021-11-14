package com.demo;

import java.util.ArrayList;

import com.demo.pojo.Answer;
import com.demo.pojo.Question;
import com.demo.service.QuizDaoiml;

public class MainClient {

	public static void main(String[] args) {
		QuizDaoiml  quez = new QuizDaoiml();
	      
		 Answer ans1=new Answer();  
		    ans1.setAnswername("Java is an programming language");  
		    ans1.setPostedBy("abc");  
		      
		  
		      
		   
		      
	
		    Question question1=new Question();  
		    question1.setQname("What is Java?");  
		    
		    
		    quez.createQuestion(question1,ans1);
		      
	 
	
	}

}