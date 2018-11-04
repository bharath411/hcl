package com.slokam.exam.springboot.ExamSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.springboot.ExamSpringBoot.dao.TableDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.TablePojo;

@Service
public class TableService {

	@Autowired
	private TableDao tabledao;
	
	public List<TablePojo> GetAllTableData(){
		
		return tabledao.findAll();
		
	}
	public List<Object[]> GetAllTableArray(){
		
	return	tabledao.GetAllTableArray();
	}
}
