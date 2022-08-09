package com.hospital.managedata.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.managedata.details.DoctorDetails;
import com.hospital.managedata.details.PatientDetails;
import com.hospital.managedata.doctorservice.DoctorService;
import com.hospital.managedata.patientservice.PatientService;

@RestController
public class HospitalController {
	
	@Autowired
	private PatientService patientServiceObject;
	
	@Autowired
	private DoctorService doctorServiceObject;
	
	//get patient details by patient id
	@GetMapping("/patient/id/{id}")
	public Optional<PatientDetails>getPatientById(@PathVariable("id") int patientId){
		return patientServiceObject.getPatientById(patientId);
	}
	
	//get patient details by patient name
	@GetMapping("/patient/name/{name}")
	public Optional<PatientDetails>getPatientByName(@PathVariable("name") String patientName){
		return patientServiceObject.getPatientByName(patientName);
	}
	
	//get patient details by room number 
	@GetMapping("/patient/room/{room}")
	public List<PatientDetails>getPatientByRoom(@PathVariable("room") int patientRoom){
		return patientServiceObject.getPatientByRoom(patientRoom);
	}
		
	//get all the patients details
	@GetMapping("/patients")
	public List<PatientDetails> getPatients(){
		return patientServiceObject.getPatients();
	}
	
	//To add new patient 
	@PostMapping("addpatient")
	public String addPatient(@RequestBody PatientDetails newPatient) {
		patientServiceObject.addPatient(newPatient);
		return "Patient Added!!";
	}
	
	//To update details of existing patient 
	@PutMapping("updatepatient")
	public String updatePatient(@RequestBody PatientDetails updatePatient) {
		patientServiceObject.addPatient(updatePatient);
		return "Patient Updated!!";
	}
	
	//To delete the record of particular patient
	@DeleteMapping("/deletepatient/{id}")
	public String deletePatient(@PathVariable("id") int patientId) {
		patientServiceObject.deletePatient(patientId);
		return "Patient Deleted!!";
	}
	
	
	//get all the doctor details
	@GetMapping("/doctors")
	public List<DoctorDetails> getDoctors(){
		return doctorServiceObject.getDoctors();
	}
	
	//get detail of particular doctor by name
	@GetMapping("/doctor/name/{name}")
	public List<DoctorDetails> getDoctorByName(@PathVariable("name") String doctorName){
		return doctorServiceObject.getDoctorByName(doctorName);
	}
	
	//get doctor details by doctor id
	@GetMapping("/doctor/id/{id}")
	public Optional<DoctorDetails> getDoctorById(@PathVariable("id") int doctorId){
		return doctorServiceObject.getDoctorById(doctorId);
	}
	
	//get all the doctors details of particular dept;
	@GetMapping("/doctor/dept/{dept}")
	public Optional<DoctorDetails> getDoctorByDept(@PathVariable("dept") String dept){
		return doctorServiceObject.getDoctorByDept(dept);
	}
	
	//get doctor details of particular room number
	@GetMapping("/doctor/room/{room}")
	public List<DoctorDetails> getDoctorByRoom(@PathVariable("room") int doctorRoom){
		return doctorServiceObject.getDoctorByRoom(doctorRoom);
	}
	
	//To add new doctor
	@PostMapping("/adddoctor")
	public String addDoctor(@RequestBody DoctorDetails newDoctor) {
		doctorServiceObject.addDoctor(newDoctor);
		return "Doctor Added!!";
	}
	
	//To update details of existing doctor
	@PutMapping("/updatedoctor")
	public String updateDoctor(@RequestBody DoctorDetails updateDoctor) {
		doctorServiceObject.updateDoctor(updateDoctor);
		return "Doctor Updated!!";
	}
	
	//To delete the record of particular Doctor
	@DeleteMapping("deletedoctor/{id}")
	public String deleteDoctor(@PathVariable("id") int doctorId) {
		doctorServiceObject.deleteDoctor(doctorId);
		return "Doctor Deleted!!";
	}
	
}
