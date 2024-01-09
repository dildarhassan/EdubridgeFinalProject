package com.spring.app.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PatientDetails")
public class PatientDetails {

	@Id
	private long bookingId;
	private String bookedBy;
	private long contactNo;
	 @JsonFormat(pattern = "yyyy-MM-dd")
	private String date;
	 
	 
	public String getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
	}
	private String patientName;
	private int doctorId;
	
	
	
	
	public PatientDetails(int doctorId, String name, long contactNo, String date, String patientName,
			long bookingId) {
		super();
		this.bookingId = bookingId;
		this.bookedBy = name;
		this.contactNo = contactNo;
		this.date = date;
		this.patientName = patientName;
		this.doctorId = doctorId;
	}
	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	@Override
	public String toString() {
		return "PatientDetails [id="  + ", name=" + bookedBy + ", contactNo=" + contactNo + ", date=" + date
				+ ", patientName=" + patientName + ", doctorId=" + doctorId + ", bookingId=" + bookingId + "]";
	}
	
	
	
}