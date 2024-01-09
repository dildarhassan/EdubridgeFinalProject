package com.spring.app.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.entity.PatientDetails;
import com.spring.app.services.PatientService;

@RequestMapping("/patientController")
@RestController
@CrossOrigin("*")
public class PatientController {
	
	@Autowired
	private PatientService pService;
	
	@PostMapping("/registerPatient")
	public void registerPatient(@RequestBody PatientDetails pDetails) {   
		pService.registerPatientDetails(pDetails);
	}
	
	@GetMapping("/getAll")
	public List<PatientDetails> getAllpatientsInfo(){
		return pService.getAllPatientsInfo();
	}
	
	/*


*/

}
