package com.spring.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.spring.app.entity.ContactUsForm;
import com.spring.app.entity.PatientDetails;

@Repository
public interface PatientRepo extends JpaRepositoryImplementation<PatientDetails,Integer> {

}

