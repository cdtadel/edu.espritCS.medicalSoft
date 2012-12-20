package edu.espritCS.medicalSoftEJB.domain.office;

import javax.ejb.Local;

import edu.espritCS.medicalSoftEJB.entities.Office;

@Local
public interface OfficeServiceLocal {

	void createOffice(Office office);

	void updateOffice(Office office);

	void removeOffice(Office office);

	Office getOffice();

}