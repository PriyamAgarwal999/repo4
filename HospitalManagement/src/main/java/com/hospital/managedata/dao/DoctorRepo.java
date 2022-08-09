package com.hospital.managedata.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.managedata.details.DoctorDetails;

public interface DoctorRepo extends JpaRepository<DoctorDetails,Integer> {

	List<DoctorDetails> findByDoctorName(String doctorName);

	Optional<DoctorDetails> findByDept(String dept);

	List<DoctorDetails> findByDoctorRoom(int doctorRoom);
}