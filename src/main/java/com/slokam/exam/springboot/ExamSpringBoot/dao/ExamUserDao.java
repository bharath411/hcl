package com.slokam.exam.springboot.ExamSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.exam.springboot.ExamSpringBoot.entity.ExamUserPojo;

@Repository
public interface ExamUserDao extends JpaRepository<ExamUserPojo, Long>{

}
