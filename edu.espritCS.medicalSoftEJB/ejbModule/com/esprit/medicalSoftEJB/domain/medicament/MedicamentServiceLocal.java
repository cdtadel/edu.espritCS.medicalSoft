package com.esprit.medicalSoftEJB.domain.medicament;

import javax.ejb.Local;

import com.esprit.medicalSoftEJB.entities.Medicament;

@Local
public interface MedicamentServiceLocal {

	void createMedicament(Medicament medicament);

	void updateMedicament(Medicament medicament);

	void removeMedicament(Medicament medicament);

	void findMedicamentById(Long id);

}