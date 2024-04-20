package ma.enset.tp2elamranihouda.service;

import ma.enset.tp2elamranihouda.entities.Consultation;
import ma.enset.tp2elamranihouda.entities.Medecin;
import ma.enset.tp2elamranihouda.entities.Patient;
import ma.enset.tp2elamranihouda.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
