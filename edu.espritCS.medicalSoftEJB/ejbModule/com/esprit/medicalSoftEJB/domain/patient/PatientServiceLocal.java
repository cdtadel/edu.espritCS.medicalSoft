package com.esprit.medicalSoftEJB.domain.patient;

import javax.ejb.Local;

import com.esprit.medicalSoftEJB.entities.Patient;

@Local
public interface PatientServiceLocal {
	
	void createPatient(Patient patient);

	void updatePatient(Patient patient);

	void removePatient(Patient patient);

	Patient findPatientById(Long id);

}