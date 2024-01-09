package com.spring.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.spring.app.entity.Carousel;

@Repository
public interface CarouselRepo extends JpaRepositoryImplementation<Carousel,Integer>{

}
