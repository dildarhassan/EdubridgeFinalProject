package com.spring.app.services;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.entity.PatientDetails;
import com.spring.app.repository.PatientRepo;

@Service
public class PatientService {

	@Autowired
	PatientRepo pRepo;
	
	
	public void registerPatientDetails(PatientDetails pDetails) {
		Random random = new Random();
		pDetails.setBookingId( 100000 + random.nextInt(900000));
       
		pRepo.save(pDetails);
	}
	
	public List<PatientDetails> getAllPatientsInfo(){
		
		return pRepo.findAll();
	}
}
