package com.slokam.exam.springboot.ExamSpringBoot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="selectedOption")
public class SelectedOption {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name="qid")
	private QuetionPojo quetion;
	@OneToOne
	@JoinColumn(name="oid")
	private OptionPojo option;
	@ManyToOne
	@JoinColumn(name="euid")
	private ExamUserPojo examuser;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public QuetionPojo getQuetion() {
		return quetion;
	}
	public void setQuetion(QuetionPojo quetion) {
		this.quetion = quetion;
	}
	public OptionPojo getOption() {
		return option;
	}
	public void setOption(OptionPojo option) {
		this.option = option;
	}
	public ExamUserPojo getExamuser() {
		return examuser;
	}
	public void setExamuser(ExamUserPojo examuser) {
		this.examuser = examuser;
	}
	
	
	
}
