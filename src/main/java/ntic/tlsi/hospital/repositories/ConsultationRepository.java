package ntic.tlsi.hospital.repositories;

import ntic.tlsi.hospital.entities.Consultation;
import ntic.tlsi.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
// mossab
public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
