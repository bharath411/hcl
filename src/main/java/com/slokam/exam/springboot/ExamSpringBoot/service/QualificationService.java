package com.slokam.exam.springboot.ExamSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.springboot.ExamSpringBoot.dao.QualificationDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.QualificationPojo;

@Service
public class QualificationService {

	@Autowired
	private QualificationDao qualificationDao;
	
	public List<QualificationPojo> getQualifications(){
		
		return qualificationDao.findAll();
	}
}
