package com.esprit.medicalSoftEJB.domain.ordonnance;

import javax.ejb.Local;

import com.esprit.medicalSoftEJB.entities.Ordonnance;

@Local
public interface OrdonnanceServiceLocal {

	void createOrdonnance(Ordonnance ordonnance);

	void updateOrdonnance(Ordonnance ordonnance);

	void removeOrdonnance(Ordonnance ordonnance);

	void findOrdonnanceById(Long id);

}