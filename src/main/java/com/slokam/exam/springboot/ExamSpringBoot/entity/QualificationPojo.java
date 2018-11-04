package com.slokam.exam.springboot.ExamSpringBoot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qualification")
public class QualificationPojo {

	@Id
	@GeneratedValue
	private long id;
	private String qualificationName;
    private String description;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQualificationName() {
		return qualificationName;
	}
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "QualificationPojo [id=" + id + ", qualificationName=" + qualificationName + ", description="
				+ description + "]";
	}
    
    
	
	
}
