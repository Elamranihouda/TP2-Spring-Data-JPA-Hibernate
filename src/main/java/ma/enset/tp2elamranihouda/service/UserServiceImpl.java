package ma.enset.tp2elamranihouda.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.enset.tp2elamranihouda.entities.Role;
import ma.enset.tp2elamranihouda.entities.User;
import ma.enset.tp2elamranihouda.repositories.RoleRepository;
import ma.enset.tp2elamranihouda.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    @Override
    public User addNewUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public Role findRoleByRoleName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        User user = findUserByUserName(userName);
        Role role = findRoleByRoleName(roleName);
        if (user != null && user.getRoles()!=null){
            user.getRoles().add(role);
            role.getUsers().add(user);
        }
    }

    @Override
    public User authenticate(String userName, String password) {
        User user=userRepository.findByUserName(userName);
        if (user==null) {throw new RuntimeException("Bad username or password");}
        if(user.getPassword().equals(password)){
            return user;
        }
        throw new RuntimeException("Bad username or password");
    }
}
