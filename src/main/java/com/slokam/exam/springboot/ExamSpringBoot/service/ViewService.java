package com.slokam.exam.springboot.ExamSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.springboot.ExamSpringBoot.dao.ViewDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.ViewPojo;

@Service
public class ViewService {

	@Autowired
	private ViewDao viewdao;
	
	public ViewPojo getViewById(Integer id) {
		
	 Optional<ViewPojo> ope= viewdao.findById(id);
	 
	 if(ope.isPresent()) {
		 return ope.get();
	 }else {
		 return null;
	 }
	}
	   
	 public Integer getViews() {
		 
		 Optional<ViewPojo> ope=viewdao.findById(1);
		 if(ope.isPresent()) {
			ViewPojo view=ope.get();
			Integer count=view.getCount();
		
			count++;
			view.setCount(count);
			
			viewdao.save(view);
		 }
		 
		 Optional<ViewPojo> opetion=viewdao.findById(1);
		 if(ope.isPresent()) {
			 return ope.get().getCount();
		 }else {
			 return null;
		 }
		 
	 }
	 
	
}
