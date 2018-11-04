package com.slokam.exam.springboot.ExamSpringBoot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.springboot.ExamSpringBoot.dao.ExamUserDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.ExamUserPojo;
import com.slokam.exam.springboot.ExamSpringBoot.service.ExamUserService;


@RestController
@RequestMapping("Exam_User")
public class ExamUserController {

	@Autowired
	private ExamUserService examuserservice;
	
	@PostMapping("/start")
	public void startExamUserDate(@RequestBody ExamUserPojo examuser) {
		
		examuserservice.startExamUserDate(examuser);
	}
	
	@PostMapping("/end/{id}")
	public void endExamUser(@PathVariable(name="id")long examuserid) {
		
		examuserservice.endExamUser(examuserid);
	}
	
	}

