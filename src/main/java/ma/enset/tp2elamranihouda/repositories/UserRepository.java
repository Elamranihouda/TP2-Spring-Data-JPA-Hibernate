package ma.enset.tp2elamranihouda.repositories;

import ma.enset.tp2elamranihouda.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserName(String userName);
}
