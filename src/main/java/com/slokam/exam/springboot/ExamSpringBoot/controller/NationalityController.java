package com.slokam.exam.springboot.ExamSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slokam.exam.springboot.ExamSpringBoot.entity.NationalityPojo;
import com.slokam.exam.springboot.ExamSpringBoot.service.NationalityService;

@Repository
@RequestMapping("nationality")
@CrossOrigin
public class NationalityController {

	@Autowired
	private NationalityService NationalityService;
	
	@GetMapping("/all")
	public ResponseEntity<List<NationalityPojo>> getQualifications(){
		
		List<NationalityPojo> list=NationalityService.getNationalities();
		ResponseEntity<List<NationalityPojo>> re=new ResponseEntity<List<NationalityPojo>>(list,HttpStatus.OK);
		return re;
		
	}
}
