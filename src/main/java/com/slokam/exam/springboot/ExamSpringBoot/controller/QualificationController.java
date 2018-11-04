package com.slokam.exam.springboot.ExamSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.springboot.ExamSpringBoot.entity.QualificationPojo;
import com.slokam.exam.springboot.ExamSpringBoot.service.QualificationService;

@RestController
@RequestMapping("qualification")
@CrossOrigin
public class QualificationController {

	@Autowired
	private QualificationService QualificationService;
	
	@GetMapping("/all")
	public ResponseEntity<List<QualificationPojo>> getQualifications(){
		
		List<QualificationPojo> list=QualificationService.getQualifications();
ResponseEntity<List<QualificationPojo>> response=new ResponseEntity<List<QualificationPojo>>(list,HttpStatus.OK);
	
	return response;
	
	}
	
}









