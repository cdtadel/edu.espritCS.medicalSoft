package edu.espritCS.medicalSoftEJB.domain.patient;

import javax.ejb.Remote;

import edu.espritCS.medicalSoftEJB.entities.Patient;

@Remote
public interface PatientServiceRemote {

	void createPatient(Patient patient);

	void updatePatient(Patient patient);

	void removePatient(Patient patient);

	Patient findPatientById(Long id);
}
