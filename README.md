## Activité Pratique N°2 - Spring Data JPA Hibernate
##### L'activité pratique N°2 se concentre sur l'utilisation de Spring Data JPA Hibernate pour la gestion des données dans une application Spring Boot. Cette activité vous permettra de comprendre les concepts de base de Spring Data JPA et de mettre en œuvre des opérations CRUD (Create, Read, Update, Delete) sur une base de données relationnelle.L'activité sert également à apprendre à configurer différentes bases de données, telles que H2 et MySQL, et à effectuer une migration entre elles.
### 1-2.Installation de IntelliJ Ultimate et Création du projet :
###### Après avoir installé IntelliJ Ultimate, nous avons créé un nouveau projet Spring Boot avec les dépendances nécessaires, y compris JPA, H2 Database, Spring Web et Lombok.
### 3.Création de l'entité JPA Patient:
###### Dans le projet nous avons créé une entité JPA nommée Patient avec les attributs requis, tels que id, nom, dateNaissance, malade et score, en utilisant les annotations de Lombok et JPA pour la gestion des entités.
<img width="494" alt="3" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/5d537b0f-281e-434b-a31d-7225bc7a5bdf">

### 4. Configuration de l'unité de persistance :
###### Nous avons configuré l'unité de persistance dans le fichier application.properties pour utiliser la base de données H2 en mémoire.
<img width="461" alt="4" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/c842886d-4fcf-43fd-bdfb-b336bfe7af48">

### 5. Création de l'interface JPA Repository :
###### Nous avons créé une interface PatientRepository en étendant JpaRepository pour fournir les opérations CRUD de base.
<img width="554" alt="5" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/7b630d37-c44e-4143-a809-19209ad16adb">

### 6. Tester les opérations de gestion de patients :
###### Nous avons implémenté et testé plusieurs opérations de gestion de patients :
##### Ajouter des patients.
##### Consulter tous les patients.
##### Consulter un patient spécifique.
##### Chercher des patients par critères.
##### Mettre à jour un patient.
##### Supprimer un patient.
<img width="590" alt="6 1" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/092df7a5-0259-4a07-8082-b1c7422676f8">
<img width="407" alt="6 2" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/9931e5eb-dc52-4fac-8a50-64d588bc1cde">
<img width="550" alt="6 4" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/04c7821a-04b2-4934-a61e-6245975b181a">

### 7. Migration de H2 Database vers MySQL :
###### Nous avons modifié la configuration dans application.properties pour passer de la base de données H2 à MySQL, en ajustant les paramètres de connexion et les propriétés Hibernate.
<img width="649" alt="7" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/5b48da76-a939-4fb4-b6ca-b8172711c9f5">

### 8. Reprise des exemples supplémentaires :
###### Nous avons repris les exemples de gestion des entités Patient, Médecin, Rendez-vous, Consultation, Users et Roles des vidéos fournies pour compléter le projet et explorer davantage les capacités de Spring Data JPA.
<img width="606" alt="83" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/8dd60609-ca88-4ef8-9564-37ff39bc22ef">
<img width="521" alt="81" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/38acc90b-524a-44be-9b87-db9d79f8ac18">
<img width="571" alt="82" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/698ac814-6c0d-4aa9-94bf-ffef1f00291a">
<img width="587" alt="84" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/2a68a712-0923-49c8-ac95-80525482eee0">
<img width="674" alt="85" src="https://github.com/Elamranihouda/TP2-Spring-Data-JPA-Hibernate/assets/96799465/dd441fe6-6d43-44b9-b6b2-c8e01b991124">

