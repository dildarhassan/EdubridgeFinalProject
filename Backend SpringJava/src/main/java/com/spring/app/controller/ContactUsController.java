package com.spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.entity.ContactUsForm;
import com.spring.app.services.ContactUsService;

@RequestMapping("/contactUsController")
@RestController
@CrossOrigin("*")
public class ContactUsController {
	@Autowired
	private ContactUsService contactUs;
	
	
	@PostMapping("/submitForm")
	public ResponseEntity<ContactUsForm> submitContactUsForm(@RequestBody ContactUsForm c) {
	    contactUs.saveFromData(c);
	    return ResponseEntity.ok(c);
	}

}
