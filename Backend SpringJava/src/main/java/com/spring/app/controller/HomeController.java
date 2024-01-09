package com.spring.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.entity.Carousel;
import com.spring.app.entity.ContactUsForm;
import com.spring.app.entity.DoctorDetails;
import com.spring.app.entity.UserDetails;
import com.spring.app.repository.DoctorRepo;
import com.spring.app.repository.UserDetailsRepo;
import com.spring.app.services.CarouselService;
import com.spring.app.services.ContactUsService;
import com.spring.app.services.DoctorService;
import com.spring.app.services.UserDetailsServiceImp;

@RestController
@RequestMapping()
@CrossOrigin("*")
public class HomeController {
	
	@Autowired
	UserDetailsRepo user;
	@Autowired
	private CarouselService cs;
	
	
	@Autowired
	private DoctorRepo dr;
	
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		return "Welcome";
	}
	
	
	@GetMapping("/carouselItems")
	public List<Carousel> getAll(){
		return cs.getAllCarousel();
	}


	
}
