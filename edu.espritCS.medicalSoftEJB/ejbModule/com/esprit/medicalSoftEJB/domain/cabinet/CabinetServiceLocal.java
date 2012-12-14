package com.esprit.medicalSoftEJB.domain.cabinet;

import javax.ejb.Local;

import com.esprit.medicalSoftEJB.entities.Cabinet;

@Local
public interface CabinetServiceLocal {

	void createCabinet(Cabinet cabinet);

	void updateCabinet(Cabinet cabinet);

	void removeCabinet(Cabinet cabinet);

	void findCabinetById(Long id);

}