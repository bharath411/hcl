package com.slokam.exam.springboot.ExamSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.springboot.ExamSpringBoot.dao.NationalityDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.NationalityPojo;

@Service
public class NationalityService {

	
	@Autowired
	private NationalityDao NationalityDao;
	
	public List<NationalityPojo> getNationalities(){
		
		return NationalityDao.findAll();
	}
}

