package com.hospital.managedata.details;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DoctorDetails {

	@Id
	private int doctorId;
	
	private String doctorName;
	private int doctorRoom;
	private String doctorMobile;
	private String dept;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorRoom() {
		return doctorRoom;
	}
	public void setDoctorRoom(int doctorRoom) {
		this.doctorRoom = doctorRoom;
	}
	public String getDoctorMobile() {
		return doctorMobile;
	}
	public void setDoctorMobile(String doctorMobile) {
		this.doctorMobile = doctorMobile;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
