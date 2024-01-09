package com.spring.app.configuration;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;

//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration  {
//	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception
//	{
//		return security.csrf().disable()
//				.authorizeHttpRequests()
//				.requestMatchers("/signup").permitAll()
//				.and()
//				.authorizeHttpRequests().requestMatchers("/signup")
//				.authenticated()
//				.and()
//				.sessionManagement()
//				.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//				.and().build();
//		/*return HttpSecurity.csrf(csrf->csrf.disable())
//				.authorizeHttpRequests(auth->auth
//						.requestMatchers("/signup")
//						.permitAll()
//						.anyRequest()
//						.authenticated())
//				.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//				.authenticationProvider(AuthenticationProvider())
//				.build();*/
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder()
//	{
//		return new BCryptPasswordEncoder();
//	}


