package com.slokam.exam.springboot.ExamSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.exam.springboot.ExamSpringBoot.entity.ExamPojo;

@Repository
public interface ExamDao extends JpaRepository<ExamPojo, Long> {

	@Query("select e.id,e.examName,e.subject from ExamPojo e ")
	public List<Object[]> getExamDetails();

	/*@Query("select e.id,e.examName,e.subject"
			+ "from ExamPojo e ")
	public List<ExamPojo> getExamAllDetails();
}

@Query("select e.id,e.examName,e.subject,e.createdBy.id,e.createdBy.name,e.createdBy.dob"
		+ ",e.createdBy.gender,e.createdBy.nationlity.id,e.createdBy.nationlity.name,"
	+ "e.quetionlist.id, e.quetionlist.description,from ExamPojo e  ")
*/
}