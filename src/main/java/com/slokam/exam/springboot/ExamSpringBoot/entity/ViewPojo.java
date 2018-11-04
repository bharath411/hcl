package com.slokam.exam.springboot.ExamSpringBoot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="view")
public class ViewPojo {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer age;
	private String qual;
	private Integer count;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	@Override
	public String toString() {
		return "ViewPojo [id=" + id + ", name=" + name + ", age=" + age + ", qual=" + qual + ", count=" + count
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getQual()="
				+ getQual() + ", getCount()=" + getCount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
       
	

}
