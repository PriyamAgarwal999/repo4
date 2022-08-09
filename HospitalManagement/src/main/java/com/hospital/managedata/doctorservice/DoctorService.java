package com.hospital.managedata.doctorservice;

import java.util.List;
import java.util.Optional;

import com.hospital.managedata.details.DoctorDetails;

public interface DoctorService {
	
	public List<DoctorDetails> getDoctors();
	public List<DoctorDetails> getDoctorByName(String doctorName);
	public Optional<DoctorDetails> getDoctorById(int doctorId);
	public Optional<DoctorDetails> getDoctorByDept(String dept);
	public List<DoctorDetails> getDoctorByRoom(int doctorRoom);
	public DoctorDetails addDoctor(DoctorDetails newDoctor);
	public DoctorDetails updateDoctor(DoctorDetails updateDoctor);
	public String deleteDoctor(int doctorId);
}
