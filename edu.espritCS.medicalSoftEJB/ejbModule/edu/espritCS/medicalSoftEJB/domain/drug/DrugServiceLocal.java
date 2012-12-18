package edu.espritCS.medicalSoftEJB.domain.drug;

import javax.ejb.Local;

import edu.espritCS.medicalSoftEJB.entities.Drug;

@Local
public interface DrugServiceLocal {

	void createDrug(Drug drug);

	void updateDrug(Drug drug);

	void removeDrug(Drug drug);

	void findDrugById(Long id);

}