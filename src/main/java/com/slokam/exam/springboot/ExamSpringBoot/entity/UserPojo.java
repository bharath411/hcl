package com.slokam.exam.springboot.ExamSpringBoot.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserPojo {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String rolenumber;
	private String password;
	private Date dob;
	private String gender;
	
	@ManyToMany
	@JoinTable(name="user_qualification" ,joinColumns={@JoinColumn (name="uid")},
	                         inverseJoinColumns= {@JoinColumn(name="qlid")})
	private List<QualificationPojo> qualification;
	
	@ManyToOne
	@JoinColumn(name="nid")
	private NationalityPojo nationlity;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRolenumber() {
		return rolenumber;
	}
	public void setRolenumber(String rolenumber) {
		this.rolenumber = rolenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<QualificationPojo> getQualification() {
		return qualification;
	}
	public void setQualification(List<QualificationPojo> qualification) {
		this.qualification = qualification;
	}
	public NationalityPojo getNationlity() {
		return nationlity;
	}
	public void setNationlity(NationalityPojo nationlity) {
		this.nationlity = nationlity;
	}
	@Override
	public String toString() {
		return "UserPojo [id=" + id + ", name=" + name + ", rolenumber=" + rolenumber + ", password=" + password
				+ ", dob=" + dob + ", gender=" + gender + ", qualification=" + qualification + ", nationlity="
				+ nationlity + "]";
	}
	
	
	
}
