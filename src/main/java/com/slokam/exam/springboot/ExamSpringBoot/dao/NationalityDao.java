package com.slokam.exam.springboot.ExamSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.exam.springboot.ExamSpringBoot.entity.NationalityPojo;

@Repository
public interface NationalityDao extends JpaRepository<NationalityPojo, Long>{

}
