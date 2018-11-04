package com.slokam.exam.springboot.ExamSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.springboot.ExamSpringBoot.entity.UserPojo;
import com.slokam.exam.springboot.ExamSpringBoot.service.UserService;




@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userservice;
	@PostMapping
	public ResponseEntity saveUser(@RequestBody UserPojo user) {
		System.out.println(user);
		userservice.saveUser(user);
		return new  ResponseEntity(user,HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<UserPojo>> getUserAll(){
		List<UserPojo>  list=userservice.getUserAll();
		System.err.println("hai dayakar"+list);
		return new ResponseEntity<List<UserPojo>>(list,HttpStatus.OK);
		//return re;
		//ResponseEntity<List<UserPojo>> re=
	}
}
