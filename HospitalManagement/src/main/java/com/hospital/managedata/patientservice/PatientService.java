package com.hospital.managedata.patientservice;

import java.util.List;
import java.util.Optional;

import com.hospital.managedata.details.PatientDetails;

public interface PatientService {

	public Optional<PatientDetails> getPatientById(int patientId);
	public Optional<PatientDetails> getPatientByName(String patientName);
	public List<PatientDetails> getPatientByRoom(int patientRoom);
	public List<PatientDetails> getPatients();
	public PatientDetails addPatient(PatientDetails newPatient);
	public PatientDetails updatePatient(PatientDetails updatePatient);
	public String deletePatient(int patientId);
}