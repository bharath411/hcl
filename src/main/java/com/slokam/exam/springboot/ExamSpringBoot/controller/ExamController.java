package com.slokam.exam.springboot.ExamSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.springboot.ExamSpringBoot.entity.ExamPojo;
import com.slokam.exam.springboot.ExamSpringBoot.service.ExamService;

@RestController
@RequestMapping("exam")
public class ExamController {

	@Autowired
	private ExamService examservice;
	
	@PostMapping
	public void saveExam(@RequestBody ExamPojo exam) {
		
		examservice.saveExam(exam);
	}
	
	@GetMapping("/all")
	public List<Object[]> getExamDetails(){
		
		return examservice.getExamDetails();
	}
	
/*	@GetMapping("/alldetails")
	public List<ExamPojo> getExamAllDetails(){
		 
		return examservice.getExamAllDetails();
	}*/
}
