package ntic.tlsi.hospital.repositories;

import ntic.tlsi.hospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
// mossab
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
    Page<Patient> findByNomContains(String kw, Pageable pageable);
}
