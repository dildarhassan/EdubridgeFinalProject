package com.spring.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import org.springframework.stereotype.Repository;

import com.spring.app.entity.UserDetails;

@Repository
public interface UserDetailsRepo extends JpaRepositoryImplementation<UserDetails,Integer> {
	
	
	boolean findByEmail(String email);

}
