package ma.enset.tp2elamranihouda.repositories;

import ma.enset.tp2elamranihouda.entities.Consultation;
import ma.enset.tp2elamranihouda.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
