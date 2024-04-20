package ma.enset.tp2elamranihouda.repositories;

import ma.enset.tp2elamranihouda.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient,Long>{
    Patient findByName(String name);
}
