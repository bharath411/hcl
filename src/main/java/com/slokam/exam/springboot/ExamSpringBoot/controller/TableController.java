package com.slokam.exam.springboot.ExamSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.springboot.ExamSpringBoot.entity.TablePojo;
import com.slokam.exam.springboot.ExamSpringBoot.service.TableService;

@RestController
@RequestMapping("table")
@CrossOrigin
public class TableController {

	@Autowired
	private TableService tableservice;
	@GetMapping
	public ResponseEntity<List<TablePojo>> GetAllTableData(){
		
		List<TablePojo> tablelist=tableservice.GetAllTableData();
		 
		ResponseEntity<List<TablePojo>> response=new ResponseEntity<List<TablePojo>>(tablelist,HttpStatus.OK);
		
		return response;
	}
	@GetMapping("/all")
	public ResponseEntity<List<Object[]>> GetAllTableArray(){
		
		List<Object[]> tablelist=tableservice.GetAllTableArray();
		ResponseEntity<List<Object[]>> response=new ResponseEntity<List<Object[]>>(tablelist,HttpStatus.OK);
		return	response;
}

}











