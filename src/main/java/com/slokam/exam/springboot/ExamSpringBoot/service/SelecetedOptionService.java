package com.slokam.exam.springboot.ExamSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.springboot.ExamSpringBoot.dao.SelectedOptionDao;
import com.slokam.exam.springboot.ExamSpringBoot.entity.ExamUserPojo;
import com.slokam.exam.springboot.ExamSpringBoot.entity.OptionPojo;
import com.slokam.exam.springboot.ExamSpringBoot.entity.SelectedOption;

@Service
public class SelecetedOptionService {

	@Autowired
	private SelectedOptionDao selectedoptiondao;

	public void saveSelectedOption(List<SelectedOption>  selectedoption) {
		
		if (!selectedoption.isEmpty()) {
			
		SelectedOption seloption=selectedoption.get(0);
		Long examuserid=seloption.getExamuser().getId();
		Long quetionid=seloption.getQuetion().getId();
		List<SelectedOption> optionlist=selectedoptiondao.getExistingOption(examuserid, quetionid);
			if (!optionlist.isEmpty()) {
				selectedoptiondao.deleteAll(optionlist);
			}
			
			selectedoptiondao.saveAll(selectedoption);
		}
		
		
	}
}








