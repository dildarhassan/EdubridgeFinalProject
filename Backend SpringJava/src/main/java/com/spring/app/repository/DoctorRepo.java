package com.spring.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.spring.app.entity.DoctorDetails;


@Repository
public interface DoctorRepo extends JpaRepositoryImplementation<DoctorDetails,Integer> {

	//List<DoctorDetails> findAllByDesc(String desc);
}
