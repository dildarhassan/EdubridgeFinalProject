package com.spring.app.services;

import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.spring.app.entity.UserDetails;
import com.spring.app.repository.UserDetailsRepo;

@Service
public class UserDetailsServiceImp {
	
//	@Autowired
//	private UserDetailsRepo userRepo;
//	
//	@Autowired
//	private PasswordEncoder passwordEnc;
//
//
//	public boolean createCustomer(UserDetails username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		boolean isExisting=userRepo.findByEmail(username.getEmail());
//		
//		if(isExisting) {
//			throw new  UsernameNotFoundException("User Not Found");
//		}else {
//			UserDetails user=new UserDetails();
//			BeanUtils.copyProperties(username, user);
//			
//			//Hashing the password
//			user.setPassword(passwordEnc.encode(username.getPassword()));
//			
//			this.userRepo.save(user);
//			
//			return true;
//		}
//		
//	}


}
