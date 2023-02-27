package ntic.tlsi.hospital.repositories;

import ntic.tlsi.hospital.entities.Medecin;
import ntic.tlsi.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
Medecin findByNom(String name);
}

