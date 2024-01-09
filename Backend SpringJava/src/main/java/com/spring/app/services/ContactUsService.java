package com.spring.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.entity.ContactUsForm;
import com.spring.app.repository.ContactUsRepo;

@Service
public class ContactUsService {

	@Autowired
	ContactUsRepo cRepo;
	
	
	public void saveFromData(ContactUsForm cForm) {
		cRepo.save(cForm);
	}
}
