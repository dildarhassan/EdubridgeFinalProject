package com.spring.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.app.entity.ContactUsForm;
import com.spring.app.entity.DoctorDetails;
import com.spring.app.repository.DoctorRepo;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepo dRepo;
	
	public List<DoctorDetails> getAllDoctorByDesc(String desc){
		List<DoctorDetails> list=dRepo.findAll();
		List<DoctorDetails> li=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getSpecialization().equals(desc)) {
				li.add(list.get(i));
			}
		}
		return li;
		
	}
	
	public ResponseEntity<DoctorDetails> registerDoctorForm(DoctorDetails d) {
	    dRepo.save(d);
	    return ResponseEntity.ok(d);
	}
	
	public List<DoctorDetails> getAllDoctors(){
		return dRepo.findAll();
	}
	
	public ResponseEntity<String> deleteById(int id) {
	    dRepo.deleteById(id);
	    return ResponseEntity.ok("Remove Sucessfully");
	}
	
	
}
