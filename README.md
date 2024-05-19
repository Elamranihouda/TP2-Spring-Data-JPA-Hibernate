## Activité Pratique N°2 - Spring Data JPA Hibernate
##### L'activité pratique N°2 se concentre sur l'utilisation de Spring Data JPA Hibernate pour la gestion des données dans une application Spring Boot. Cette activité vous permettra de comprendre les concepts de base de Spring Data JPA et de mettre en œuvre des opérations CRUD (Create, Read, Update, Delete) sur une base de données relationnelle.L'activité sert également à apprendre à configurer différentes bases de données, telles que H2 et MySQL, et à effectuer une migration entre elles.
### 1-2.Installation de IntelliJ Ultimate et Création du projet :
###### Après avoir installé IntelliJ Ultimate, nous avons créé un nouveau projet Spring Boot avec les dépendances nécessaires, y compris JPA, H2 Database, Spring Web et Lombok.
### 3.Création de l'entité JPA Patient:
###### Dans le projet nous avons créé une entité JPA nommée Patient avec les attributs requis, tels que id, nom, dateNaissance, malade et score, en utilisant les annotations de Lombok et JPA pour la gestion des entités.
### 4. Configuration de l'unité de persistance :
###### Nous avons configuré l'unité de persistance dans le fichier application.properties pour utiliser la base de données H2 en mémoire.
### 5. Création de l'interface JPA Repository :
###### Nous avons créé une interface PatientRepository en étendant JpaRepository pour fournir les opérations CRUD de base.
### 6. Tester les opérations de gestion de patients :
###### Nous avons implémenté et testé plusieurs opérations de gestion de patients :
##### Ajouter des patients.
##### Consulter tous les patients.
##### Consulter un patient spécifique.
##### Chercher des patients par critères.
##### Mettre à jour un patient.
##### Supprimer un patient.
### 7. Migration de H2 Database vers MySQL :
###### Nous avons modifié la configuration dans application.properties pour passer de la base de données H2 à MySQL, en ajustant les paramètres de connexion et les propriétés Hibernate.
### 8. Reprise des exemples supplémentaires :
###### Nous avons repris les exemples de gestion des entités Patient, Médecin, Rendez-vous, Consultation, Users et Roles des vidéos fournies pour compléter le projet et explorer davantage les capacités de Spring Data JPA.

