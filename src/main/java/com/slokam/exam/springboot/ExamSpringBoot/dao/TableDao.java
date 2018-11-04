package com.slokam.exam.springboot.ExamSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.exam.springboot.ExamSpringBoot.entity.TablePojo;

@Repository
public interface TableDao extends JpaRepository<TablePojo, Integer> {

	@Query("select t.id,t.name,t.salary,t.country,t.city from TablePojo t")
	public List<Object[]> GetAllTableArray();
	
}
