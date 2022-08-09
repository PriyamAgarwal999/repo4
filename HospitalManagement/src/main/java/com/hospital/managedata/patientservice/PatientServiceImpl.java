package com.hospital.managedata.patientservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.managedata.dao.PatientRepo;
import com.hospital.managedata.details.PatientDetails;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepo repo;
	
	@Override
	public Optional<PatientDetails> getPatientById(int patientId) {
		return repo.findById(patientId);
	}

	@Override
	public Optional<PatientDetails> getPatientByName(String patientName) {
		return repo.findByPatientName(patientName);
	}

	@Override
	public List<PatientDetails> getPatientByRoom(int patientRoom) {
		// TODO Auto-generated method stub
		return repo.findByPatientRoom(patientRoom);
	}

	@Override
	public List<PatientDetails> getPatients() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public PatientDetails addPatient(PatientDetails newPatient) {
		// TODO Auto-generated method stub
		return repo.save(newPatient);
	}

	@Override
	public PatientDetails updatePatient(PatientDetails updatePatient) {
		// TODO Auto-generated method stub
		return repo.save(updatePatient);
	}
	
	@Override
	public String deletePatient(int patientId) {
		// TODO Auto-generated method stub
		PatientDetails patientDeleted=repo.getById(patientId);
		repo.delete(patientDeleted);
		return "deleted!!";
	}

}
