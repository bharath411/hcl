package com.slokam.exam.springboot.ExamSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.exam.springboot.ExamSpringBoot.entity.SelectedOption;

@Repository
public interface SelectedOptionDao extends JpaRepository<SelectedOption, Long> {

	@Query("from SelectedOption s join s.examuser eu join s.quetion q where eu.id=?1 and q.id=?2")
	public List<SelectedOption> getExistingOption(long examuserid,long quetionid);
	
	@Query(" from SelectedOption s where s.examuser.id=?1 and s.option.correct=true")
	public List<SelectedOption> getSelectOptionByExamUser(long examUserId);
}
//@Query("from SelectedOption s  where s.examUser.id=?1 and s.option.correct=true")
