package com.slokam.exam.springboot.ExamSpringBoot.dao;

import org.springframework.data.jpa.domain.QAbstractAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.exam.springboot.ExamSpringBoot.entity.QualificationPojo;

@Repository
public interface QualificationDao extends JpaRepository<QualificationPojo, Long> {

	
}
