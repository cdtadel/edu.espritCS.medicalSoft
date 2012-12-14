package com.esprit.medicalSoftEJB.domain.rendezVous;

import javax.ejb.Local;

import com.esprit.medicalSoftEJB.entities.RendezVous;

@Local
public interface RendezVousServiceLocal {

	void createRendezVous(RendezVous rdv);

	void updateRendezVous(RendezVous rdv);

	void removeRendezVous(RendezVous rdv);

	void findRendezVousById(Long id);

}