package ma.enset.tp2elamranihouda.web;

import ma.enset.tp2elamranihouda.entities.Patient;
import ma.enset.tp2elamranihouda.entities.User;
import ma.enset.tp2elamranihouda.repositories.PatientRepository;
import ma.enset.tp2elamranihouda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{username}")
    public User user(@PathVariable String username) {
        User user=userService.findUserByUserName(username);
        return user;
    }
}
