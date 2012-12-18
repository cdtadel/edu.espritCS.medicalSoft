package edu.espritCS.medicalSoftEJB.domain.patient;

import java.util.List;

import javax.ejb.Local;

import edu.espritCS.medicalSoftEJB.entities.Patient;

@Local
public interface PatientServiceLocal {

	void createPatient(Patient patient);

	void updatePatient(Patient patient);

	void removePatient(Patient patient);

	Patient findPatientById(Long id);

	List<Patient> findAllPatient();

}