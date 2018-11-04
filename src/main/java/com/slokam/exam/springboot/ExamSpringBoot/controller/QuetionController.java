package com.slokam.exam.springboot.ExamSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.springboot.ExamSpringBoot.entity.QuetionPojo;
import com.slokam.exam.springboot.ExamSpringBoot.service.QuetionService;

@RestController
@RequestMapping("quetion")
public class QuetionController {

	@Autowired
	private QuetionService quetionservice;
	
	@PostMapping
	public void saveQuetion(@RequestBody QuetionPojo quetion) {
		quetionservice.saveQuetion(quetion);
	}
	
	@GetMapping("/{id}")
	public QuetionPojo getByQuetionById(@PathVariable long id) {
		
		return quetionservice.getByQuetionById(id);
	}
	
}	

