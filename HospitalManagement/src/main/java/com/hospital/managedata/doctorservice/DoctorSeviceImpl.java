package com.hospital.managedata.doctorservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.managedata.dao.DoctorRepo;
import com.hospital.managedata.details.DoctorDetails;

@Service
public class DoctorSeviceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepo repo;

	@Override
	public List<DoctorDetails> getDoctors() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<DoctorDetails> getDoctorByName(String doctorName) {
		// TODO Auto-generated method stub
		return repo.findByDoctorName(doctorName);
	}

	@Override
	public Optional<DoctorDetails> getDoctorById(int doctorId) {
		// TODO Auto-generated method stub
		return repo.findById(doctorId);
	}

	@Override
	public Optional<DoctorDetails> getDoctorByDept(String dept) {
		// TODO Auto-generated method stub
		return repo.findByDept(dept);
	}

	@Override
	public List<DoctorDetails> getDoctorByRoom(int doctorRoom) {
		// TODO Auto-generated method stub
		return repo.findByDoctorRoom(doctorRoom);
	}

	@Override
	public DoctorDetails addDoctor(DoctorDetails newDoctor) {
		// TODO Auto-generated method stub
		return repo.save(newDoctor);
	}

	@Override
	public DoctorDetails updateDoctor(DoctorDetails updateDoctor) {
		// TODO Auto-generated method stub
		return repo.save(updateDoctor);
	}

	@Override
	public String deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		DoctorDetails deletedDoctor=repo.getById(doctorId);
		repo.delete(deletedDoctor);
		return "deleted!!";
	}



}
