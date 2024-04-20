package ma.enset.tp2elamranihouda.service;

import jakarta.transaction.Transactional;
import ma.enset.tp2elamranihouda.entities.Consultation;
import ma.enset.tp2elamranihouda.entities.Medecin;
import ma.enset.tp2elamranihouda.entities.Patient;
import ma.enset.tp2elamranihouda.entities.RendezVous;
import ma.enset.tp2elamranihouda.repositories.ConsultationRepository;
import ma.enset.tp2elamranihouda.repositories.MedecinRepository;
import ma.enset.tp2elamranihouda.repositories.PatientRepository;
import ma.enset.tp2elamranihouda.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
