package com.slokam.exam.springboot.ExamSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.springboot.ExamSpringBoot.dao.QuetionDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.OptionPojo;
import com.slokam.exam.springboot.ExamSpringBoot.entity.QuetionPojo;

@Service
public class QuetionService {

	@Autowired
	private QuetionDao quetiondao;
	
	public void saveQuetion(QuetionPojo quetion) {
		
		List<OptionPojo> optionlist=quetion.getOptionlist();
		for (OptionPojo optionpojo : optionlist) {
			optionpojo.setQuetion(quetion);
		}
		quetiondao.save(quetion);
	}
	
	public QuetionPojo getByQuetionById(long id) {
		
		Optional<QuetionPojo> ope=quetiondao.findById(id);
		
		if(ope.isPresent()) {
			
			QuetionPojo quetion=ope.get();
			
			List<OptionPojo> optionlist=quetion.getOptionlist();
			
			for (OptionPojo optionpojo : optionlist) {
				optionpojo.setQuetion(null);
			}
			return quetion;
		}else {
			return null;
		}

		
	}
}










