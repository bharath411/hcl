package com.slokam.exam.springboot.ExamSpringBoot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="examuser")
public class ExamUserPojo {

	@Id
	@GeneratedValue
	private long id;
	private Date startedDate;
	private Date endDate;
	private Integer marks;
	
	
	@ManyToOne
	@JoinColumn(name="uid")
	private UserPojo user;
	
	@ManyToOne
	@JoinColumn(name="eid")
	private ExamPojo exam;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public UserPojo getUser() {
		return user;
	}

	public void setUser(UserPojo user) {
		this.user = user;
	}

	public ExamPojo getExam() {
		return exam;
	}

	public void setExam(ExamPojo exam) {
		this.exam = exam;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	
}
