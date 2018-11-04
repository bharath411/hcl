package com.slokam.exam.springboot.ExamSpringBoot.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="exam")
public class ExamPojo {

	@Id
	@GeneratedValue
	private long id;
	private String examName;
	private String subject;
	private Date createDate;
	
	@ManyToOne
	@JoinColumn(name="ucid")
	private UserPojo createdBy;
	
	@ManyToMany
	@JoinTable(name="exam_quetion",joinColumns={@JoinColumn(name="eid")},
	                                inverseJoinColumns= {@JoinColumn(name="qid")})
	
                                                    	 
	private List<QuetionPojo> quetionlist;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public UserPojo getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UserPojo createdBy) {
		this.createdBy = createdBy;
	}

	public List<QuetionPojo> getQuetionlist() {
		return quetionlist;
	}

	public void setQuetionlist(List<QuetionPojo> quetionlist) {
		this.quetionlist = quetionlist;
	}
	
	
}
