package com.hospital.managedata;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hospital.managedata.dao.DoctorRepo;
import com.hospital.managedata.dao.PatientRepo;
import com.hospital.managedata.details.DoctorDetails;
import com.hospital.managedata.details.PatientDetails;

@SpringBootTest
class HospitalManagementApplicationTests {
	
	@Autowired
	PatientRepo patientRepo;
	
	@Autowired
	DoctorRepo doctorRepo;

	@Test
	@Order(1)
	public void testPatientRepository() {
		PatientDetails p=new PatientDetails();
		p.setPatientId(105);
		p.setPatientName("Jack");
		p.setPatientRoom(1005);
		p.setPatientMobile("98398539");
		patientRepo.save(p);
		assertNotNull(patientRepo.findById(105).get());
	}
	
	@Test
	@Order(2)
	public void testDoctorRepository() {
		DoctorDetails d=new DoctorDetails();
		d.setDoctorId(105);
		d.setDoctorName("Jack");
		d.setDoctorRoom(1005);
		d.setDoctorMobile("98398539");
		d.setDept("Optha");
		
		doctorRepo.save(d);
		assertNotNull(doctorRepo.findById(105).get());
	}
	
	
	//checking the patient details is matching or not
		@Test
		@Order(3)
		public void testGetPatients() {
			PatientDetails p=patientRepo.findById(101).get();
			assertEquals("Raj", p.getPatientName());
		}
		
		//checking the doctor details is matching or not
		@Test
		@Order(4)
		public void testGetDoctors() {
			DoctorDetails d=doctorRepo.findById(101).get();
			assertEquals("Dr. Sakshi", d.getDoctorName());
		}
		
		
		
		// checking the patient details is updated successfully
		@Test
		@Order(5)
		public void testUpdatePatient() {
			PatientDetails p=new PatientDetails();
			p.setPatientId(107);
			p.setPatientName("Joe");
			p.setPatientRoom(1007);
			patientRepo.save(p);
			
			PatientDetails check=patientRepo.findById(107).get();
			check.setPatientRoom(1009);
			patientRepo.save(check);
			assertEquals(1009,patientRepo.findById(107).get().getPatientRoom());
		}
		
		// checking the doctor details is updated successfully
				@Test
				@Order(6)
				public void testUpdateDoctor() {
					DoctorDetails d=new DoctorDetails();
					d.setDoctorId(107);
					d.setDoctorName("Joe");
					d.setDoctorRoom(1007);
					d.setDept("Neuro");
					doctorRepo.save(d);
					
					DoctorDetails check=doctorRepo.findById(107).get();
					check.setDoctorRoom(1009);
					doctorRepo.save(check);
					assertEquals(1009,doctorRepo.findById(107).get().getDoctorRoom());
				}
				
				//checking deleting a record from patientRepo is working well
				@Test
				@Order(7)
				public void testPatientDelete() {
					patientRepo.deleteById(101);
					assertThat(patientRepo.existsById(101)).isFalse();
				}
				
				//checking deleting a record from doctorRepo is working well
				@Test
				@Order(8)
				public void testDoctorDelete() {
					doctorRepo.deleteById(101);
					assertThat(doctorRepo.existsById(101)).isFalse();
				}
}
