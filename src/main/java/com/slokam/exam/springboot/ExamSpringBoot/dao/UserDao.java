package com.slokam.exam.springboot.ExamSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.exam.springboot.ExamSpringBoot.entity.UserPojo;

@Repository
public interface UserDao extends JpaRepository<UserPojo, Long> {

	
}
