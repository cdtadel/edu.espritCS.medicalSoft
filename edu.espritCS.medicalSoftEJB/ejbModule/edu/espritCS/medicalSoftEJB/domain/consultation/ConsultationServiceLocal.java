package edu.espritCS.medicalSoftEJB.domain.consultation;

import java.util.List;

import javax.ejb.Local;

import edu.espritCS.medicalSoftEJB.entities.Consultation;

@Local
public interface ConsultationServiceLocal {

	void createConsultation(Consultation consultation);

	void updateConsultation(Consultation consultation);

	void removeConsultation(Consultation consultation);

	void findConsultationById(Long id);

	List<Consultation> findAllConsultation();
}