package ntic.tlsi.hospital.repositories;

import ntic.tlsi.hospital.entities.Patient;
import ntic.tlsi.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
