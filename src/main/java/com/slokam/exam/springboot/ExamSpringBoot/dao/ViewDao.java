package com.slokam.exam.springboot.ExamSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.exam.springboot.ExamSpringBoot.entity.ViewPojo;

@Repository
public interface ViewDao extends JpaRepository<ViewPojo, Integer> {

	@Query("select v.id,v.name,v.age,v.qual from ViewPojo v where id=?1")
	public ViewPojo getViewById(Integer id);
}
