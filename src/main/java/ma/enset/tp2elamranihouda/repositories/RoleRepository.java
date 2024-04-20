package ma.enset.tp2elamranihouda.repositories;

import ma.enset.tp2elamranihouda.entities.Role;
import ma.enset.tp2elamranihouda.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
