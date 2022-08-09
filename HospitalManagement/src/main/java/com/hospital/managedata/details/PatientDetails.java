package com.hospital.managedata.details;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientDetails {

	@Id
	private int patientId;
	
	private String patientName;
	private int patientRoom;
	private String patientMobile;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientRoom() {
		return patientRoom;
	}
	public void setPatientRoom(int patientRoom) {
		this.patientRoom = patientRoom;
	}
	public String getPatientMobile() {
		return patientMobile;
	}
	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}
	
	
}
