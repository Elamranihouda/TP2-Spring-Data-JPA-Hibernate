package ma.enset.tp2elamranihouda.repositories;

import ma.enset.tp2elamranihouda.entities.Medecin;
import ma.enset.tp2elamranihouda.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
