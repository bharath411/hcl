package com.slokam.exam.springboot.ExamSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.springboot.ExamSpringBoot.dao.UserDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.UserPojo;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;
	
	public void saveUser(UserPojo user) {
	System.out.println(user);
		userdao.save(user);
	}
	public List<UserPojo> getUserAll(){
		System.out.println("serive...."+userdao.findAll());
		return userdao.findAll();
	}
}
