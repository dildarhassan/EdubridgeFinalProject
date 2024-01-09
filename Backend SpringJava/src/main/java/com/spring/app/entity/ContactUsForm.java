package com.spring.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ContactUsForm")
public class ContactUsForm {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    String firstName;
    String lastName;
    String email;
    String service;
    long mobile; 
    String hearAboutUs;
    String message;

 
    public ContactUsForm() {
    }

   
    public ContactUsForm(int id, String firstName, String lastName, String email, String service, long mobile, String hearAboutUs, String message) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.service = service;
        this.mobile = mobile;
        this.hearAboutUs = hearAboutUs;
        this.message = message;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getHearAboutUs() {
        return hearAboutUs;
    }

    public void setHearAboutUs(String hearAboutUs) {
        this.hearAboutUs = hearAboutUs;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    @Override
    public String toString() {
        return "FormData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", service='" + service + '\'' +
                ", mobile=" + mobile +
                ", hearAboutUs='" + hearAboutUs + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
