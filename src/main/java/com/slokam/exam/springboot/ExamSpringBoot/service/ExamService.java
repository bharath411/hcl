package com.slokam.exam.springboot.ExamSpringBoot.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.springboot.ExamSpringBoot.dao.ExamDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.ExamPojo;
import com.slokam.exam.springboot.ExamSpringBoot.entity.NationalityPojo;
import com.slokam.exam.springboot.ExamSpringBoot.entity.QualificationPojo;
import com.slokam.exam.springboot.ExamSpringBoot.entity.UserPojo;

@Service
public class ExamService {

	@Autowired
	private ExamDao examdao;
	
	public void saveExam(ExamPojo exam) {
		exam.setCreateDate(new Date());
		examdao.save(exam);
	}
	
	
	public List<Object[]>getExamDetails(){
		 return examdao.getExamDetails();
		
	}
	/*public List<ExamPojo> getExamAllDetails(){
		
		
	   //return examdao.getExamAllDetails();
		
		List<ExamPojo> list=examdao.getExamAllDetails();
		
		
		for (ExamPojo exampojo : list) {
			exampojo.setQuetionlist(null);
			exampojo.getExamName();
			exampojo.getId();
			
			UserPojo user=exampojo.getCreatedBy();
			String username=user.getName();
			user.setName(username);
			
			exampojo.setCreatedBy(user);
			
			
			NationalityPojo nation=user.getNationlity();
			
			String nationality=nation.getName();
			
		        nation.setName(nationality);
		        user.setNationlity(nation);
		        
		        exampojo.setCreatedBy(user);
			
			List<QualificationPojo> quallist=user.getQualification();
			
			for (QualificationPojo qualificationPojo : quallist) {
				
				String qual=qualificationPojo.getQualificationName();
				
				qualificationPojo.setQualificationName(qual);
				
				quallist.add(qualificationPojo);
				
				user.setQualification(quallist);
				
				exampojo.setCreatedBy(user);
			}
			list.add(exampojo);
		}
		
		return list;
	}*/
}




