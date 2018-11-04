package com.slokam.exam.springboot.ExamSpringBoot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="options")
public class OptionPojo {

	@Id
	@GeneratedValue
	private long id;
	private String des;
	private boolean correct;
	
	@ManyToOne
	@JoinColumn(name="qid")
	private QuetionPojo quetion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	public QuetionPojo getQuetion() {
		return quetion;
	}

	public void setQuetion(QuetionPojo quetion) {
		this.quetion = quetion;
	}

	
	

}
