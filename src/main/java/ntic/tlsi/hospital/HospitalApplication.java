package ntic.tlsi.hospital;

import ntic.tlsi.hospital.entities.*;
import ntic.tlsi.hospital.repositories.ConsultationRepository;
import ntic.tlsi.hospital.repositories.MedecinRepository;
import ntic.tlsi.hospital.repositories.PatientRepository;
import ntic.tlsi.hospital.repositories.RendezVousRepository;
import ntic.tlsi.hospital.service.HospitalServiceImpl;
import ntic.tlsi.hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {
// mossab
	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}/*
@Bean
	CommandLineRunner start(PatientRepository patientRepository,
							MedecinRepository medecinRepository,
							RendezVousRepository rendezVousRepository,
							IHospitalService hospitalService
){
		return args -> {
			//patientRepository.save(new Patient(null,"Mosaab",new Date(),false,"mossab@gmail.com",null));
			Stream.of("mossab","didou","kala")
					.forEach(name ->{
						Patient patient = new Patient();
						patient.setNom(name);
						patient.setDateNaissance(new Date());
						patient.setEmail(name+(Math.random()>0.5?"@gmail.com":"@hotmail.com"));
						patient.setMalade(false);
						hospitalService.savePatient(patient);
					});

			Stream.of("dehane","talha","tbib")
					.forEach(name ->{
						Medecin medecin = new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name+(Math.random()>0.5?"@gmail.com":"@hotmail.com"));
						medecin.setSpecialite(Math.random()>0.5?"cardio":"generalist");

						hospitalService.saveMedecin(medecin);
					});

			Patient patient=patientRepository.findById(1L).orElse(null);
			Patient patient1=patientRepository.findByNom("mossab");
			Medecin medecin = medecinRepository.findByNom("dehane");


			RendezVous rendezVous= new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.PENDING);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);

			RendezVous savedRDV=hospitalService.saveRDV(rendezVous);
			System.out.println(savedRDV.getId());

            RendezVous rendezVous1=rendezVousRepository.findAll().get(0);

			Consultation consultation =new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport");
			hospitalService.saveConsultation(consultation);

		};

}*/

}
