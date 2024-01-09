package com.spring.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.entity.ContactUsForm;
import com.spring.app.entity.DoctorDetails;
import com.spring.app.services.DoctorService;

@RequestMapping("/serviceController")
@RestController
@CrossOrigin("*")
public class ServiceController {
	@Autowired
	private DoctorService dService;
	

	@GetMapping("/getDoctorsByDesc/{des}")
	public List<DoctorDetails> getDoctorByDesc(@PathVariable String des){
		return dService.getAllDoctorByDesc(des);
	}
	
	
	@PostMapping("/registerDoctorForm")
	public ResponseEntity<DoctorDetails> submitDoctorForm(@RequestBody DoctorDetails d) {
	    // Uncomment the line below to save the form data
	    return dService.registerDoctorForm(d);
	    
	}
	
	@GetMapping("/getDoctorAllDoctors")
	public List<DoctorDetails> getAllDoctors(){
		return dService.getAllDoctors();
	}
	
	@DeleteMapping("/deleteDoctorById/{id}")
	public void deleteDoctorById(@PathVariable int id) {
	    // Uncomment the line below to save the form data
	    dService.deleteById(id);
	    
	}
}
