package com.hospital.managedata.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.managedata.details.PatientDetails;

public interface PatientRepo extends JpaRepository<PatientDetails,Integer> {
	
	Optional<PatientDetails> findByPatientName(String patientName);
	List<PatientDetails> findByPatientRoom(int patientRoom);
	
}
