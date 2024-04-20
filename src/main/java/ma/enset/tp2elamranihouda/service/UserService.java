package ma.enset.tp2elamranihouda.service;

import ma.enset.tp2elamranihouda.entities.*;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName, String roleName);
    User authenticate(String userName, String password);


}

