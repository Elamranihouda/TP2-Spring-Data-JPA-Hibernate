package ma.enset.tp2elamranihouda.repositories;

import ma.enset.tp2elamranihouda.entities.Medecin;
import ma.enset.tp2elamranihouda.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByName(String name);
}
