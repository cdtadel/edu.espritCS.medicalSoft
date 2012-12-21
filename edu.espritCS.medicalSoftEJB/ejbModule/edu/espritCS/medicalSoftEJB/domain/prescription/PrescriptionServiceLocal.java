package edu.espritCS.medicalSoftEJB.domain.prescription;

import java.util.List;

import javax.ejb.Local;

import edu.espritCS.medicalSoftEJB.entities.Prescription;

@Local
public interface PrescriptionServiceLocal {

	void createPrescription(Prescription prescription);

	void updatePrescription(Prescription prescription);

	void removePrescription(Prescription prescription);

	void findPrescriptionById(Long id);

	List<Prescription> findAllPrescription();
}