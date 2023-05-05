package ntic.tlsi.hospital.service;

import ntic.tlsi.hospital.entities.Consultation;
import ntic.tlsi.hospital.entities.Medecin;
import ntic.tlsi.hospital.entities.Patient;
import ntic.tlsi.hospital.entities.RendezVous;

public interface IHospitalService {
    // mossab
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
