package com.demo.pojo;



import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
	@Id
	@GeneratedValue
	private int id;
	private String answername;
	private String postedBy;
	
	@ManyToOne
	private Question question;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	

	}