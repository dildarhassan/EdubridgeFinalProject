package com.spring.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DoctorDetails")
public class DoctorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
    private String name;
    private String specialization;
    private String experience;
    private String place; // Changed from hospital to place
    private String languages;
    private String qualifications;
    private String schedule;
    private String time;

    public DoctorDetails(int id, String name, String specialization, String experience, String place, String languages,
			String qualifications, String schedule, String time) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.experience = experience;
		this.place = place;
		this.languages = languages;
		this.qualifications = qualifications;
		this.schedule = schedule;
		this.time = time;
	}

	public DoctorDetails() {
        // Default constructor for JPA
    }


    // Getters and Setters

    public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}