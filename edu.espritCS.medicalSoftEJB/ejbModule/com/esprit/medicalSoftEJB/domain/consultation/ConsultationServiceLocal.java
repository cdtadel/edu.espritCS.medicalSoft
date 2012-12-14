package com.esprit.medicalSoftEJB.domain.consultation;

import javax.ejb.Local;

import com.esprit.medicalSoftEJB.entities.Consultation;

@Local
public interface ConsultationServiceLocal {
	
	void createConsultation(Consultation consultation);

	void updateConsultation(Consultation consultation);

	void removeConsultation(Consultation consultation);

	void findConsultationById(Long id);

}