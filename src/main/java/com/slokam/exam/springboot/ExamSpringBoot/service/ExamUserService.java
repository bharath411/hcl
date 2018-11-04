package com.slokam.exam.springboot.ExamSpringBoot.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.springboot.ExamSpringBoot.dao.ExamUserDao;
import com.slokam.exam.springboot.ExamSpringBoot.dao.SelectedOptionDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.ExamPojo;
import com.slokam.exam.springboot.ExamSpringBoot.entity.ExamUserPojo;
import com.slokam.exam.springboot.ExamSpringBoot.entity.SelectedOption;
import com.slokam.exam.springboot.ExamSpringBoot.entity.UserPojo;

@Service
public class ExamUserService {

	
	@Autowired
	private ExamUserDao examuserdao;
	@Autowired
	private SelectedOptionDao selectedoptiondao;
	
	public void startExamUserDate(ExamUserPojo examuser) {
		
		examuser.setStartedDate(new Date());
		
	    
	     
		examuserdao.save(examuser);
}
	
	public void endExamUser(long examuserid) {
		      
	List<SelectedOption> correctOptions=selectedoptiondao.getSelectOptionByExamUser(examuserid);
	
		System.out.println("total marks :: "+correctOptions.size());
		
		Optional<ExamUserPojo> opetion=examuserdao.findById(examuserid);
		if(opetion.isPresent()) {
			ExamUserPojo examuser=opetion.get();
			
			if(correctOptions.isEmpty()) {
				examuser.setMarks(0);
			}else {
				examuser.setMarks(correctOptions.size());

			}
			
			examuser.setEndDate(new Date());
			examuserdao.save(examuser);
		}
		
	}
}






