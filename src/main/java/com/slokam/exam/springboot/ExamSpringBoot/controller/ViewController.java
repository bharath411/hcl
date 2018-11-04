package com.slokam.exam.springboot.ExamSpringBoot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.springboot.ExamSpringBoot.entity.ViewPojo;
import com.slokam.exam.springboot.ExamSpringBoot.service.ViewService;

@RestController
@RequestMapping("view")
@CrossOrigin
public class ViewController {

	@Autowired
	private ViewService viewservice;
	
	@GetMapping("/daya/{id}")
	public ResponseEntity<ViewPojo> getAllViews(@PathVariable(name="id")Integer id) {
		
		ViewPojo view=viewservice.getViewById(id);
		ResponseEntity<ViewPojo> re=new ResponseEntity<ViewPojo> (view,HttpStatus.OK);
		
	 return re;
	}
	
	@GetMapping
	 public ResponseEntity<Integer> getViews() {
		 Integer views=viewservice.getViews();
		 
		 ResponseEntity<Integer> re=new ResponseEntity<Integer> (views,HttpStatus.OK);
		 
		 return re;
	 }
}
