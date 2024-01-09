package com.spring.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.entity.Carousel;
import com.spring.app.repository.CarouselRepo;

@Service
public class CarouselService {

	@Autowired
	private CarouselRepo repo;
	
	public List<Carousel> getAllCarousel(){
		
		return repo.findAll();
	}
	
	public void save(Carousel c) {
		repo.save(c);
	}
	
	public void remove(Carousel c) {
		repo.delete(c);
	}
}

