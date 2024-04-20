package ma.enset.tp2elamranihouda;

import ma.enset.tp2elamranihouda.entities.*;
import ma.enset.tp2elamranihouda.repositories.ConsultationRepository;
import ma.enset.tp2elamranihouda.repositories.MedecinRepository;
import ma.enset.tp2elamranihouda.repositories.PatientRepository;
import ma.enset.tp2elamranihouda.repositories.RendezVousRepository;
import ma.enset.tp2elamranihouda.service.HospitalServiceImpl;
import ma.enset.tp2elamranihouda.service.IHospitalService;
import ma.enset.tp2elamranihouda.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class Tp2ElamraniHoudaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp2ElamraniHoudaApplication.class, args);
    }

    @Bean
    CommandLineRunner star(IHospitalService hospitalService,
                           PatientRepository patientRepository,
                           RendezVousRepository rendezVousRepository,
                           MedecinRepository medecinRepository,
                           UserService userService
                           ){
        return args -> {
            Stream.of("Houda","Ahlam","Abdelhalim")
                    .forEach(name->{
                    Patient patient = new Patient();
                    patient.setName(name);
                    patient.setDateNaissance(new Date());
                    patient.setMalade(false);
                    patient.setScore(150);
                    hospitalService.savePatient(patient);
            });



            Stream.of("Oussama","Hanane","Sara")
                    .forEach(name->{
                        Medecin medecin = new Medecin();
                        medecin.setName(name);
                        medecin.setEmail(name+"@gmail.com");
                        medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                        hospitalService.saveMedecin(medecin);
                    });

            Patient patient=patientRepository.findById(1L).orElse(null);
            Patient patient1=patientRepository.findByName("Houda");


            Medecin medecin=medecinRepository.findByName("Sara");

            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            rendezVousRepository.save(rendezVous);

            RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);
            Consultation consultation= new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport de la consultation ....");
            hospitalService.saveConsultation(consultation);



            User u=new User();
            u.setUserName("user1");
            u.setPassword("123456");
            userService.addNewUser(u);

            User u2=new User();
            u2.setUserName("admin");
            u2.setPassword("123456");
            userService.addNewUser(u2);

            Stream.of("STUDENT","USER","ADMIN").forEach(r->{
                Role role1=new Role();
                role1.setRoleName(r);
                userService.addNewRole(role1);
            });
            userService.addRoleToUser("user1","STUDENT");
            userService.addRoleToUser("user1","USER");
            userService.addRoleToUser("admin","USER");
            userService.addRoleToUser("admin","ADMIN");

            try {
                User user=userService.authenticate("user1","123456");
                System.out.println(user.getUserId());
                System.out.println(user.getUserName());
                System.out.println("Roles=>");
                user.getRoles().forEach(r->{
                    System.out.println("Role=>"+r.toString());
                });
            }
            catch (Exception exception){
                exception.printStackTrace();
            }

        };
    }
}
