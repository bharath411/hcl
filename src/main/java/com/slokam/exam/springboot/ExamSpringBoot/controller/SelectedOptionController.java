package com.slokam.exam.springboot.ExamSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.springboot.ExamSpringBoot.entity.SelectedOption;
import com.slokam.exam.springboot.ExamSpringBoot.service.SelecetedOptionService;

@RestController
@RequestMapping("selected_option")
public class SelectedOptionController {

	@Autowired
	private SelecetedOptionService selectedoptionservice;
	
	@PostMapping
	public void saveSelectedOption(@RequestBody List<SelectedOption>  selectedoption) {

		selectedoptionservice.saveSelectedOption(selectedoption);
	}
}






