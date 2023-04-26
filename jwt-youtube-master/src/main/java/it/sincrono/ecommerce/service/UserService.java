package it.sincrono.ecommerce.service;

import it.sincrono.ecommerce.entity.Role;
import it.sincrono.ecommerce.entity.User;
import it.sincrono.ecommerce.repository.RoleRepository;
import it.sincrono.ecommerce.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setNomeRuolo("Admin");
        adminRole.setDescrizioneRuolo("Ruolo: Admin");
        roleRepository.save(adminRole);

        Role userRole = new Role();
        userRole.setNomeRuolo("Utente");
        userRole.setDescrizioneRuolo("Utente creato di e assegnato di default");
        roleRepository.save(userRole);

        User adminUser = new User();
        adminUser.setNickname("Admin");
        adminUser.setPassword(getEncodedPassword("sincrono"));
        adminUser.setNome("admin");
        adminUser.setCognome("admin");
        adminUser.setEmail("admin@sincrono.it");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userRepository.save(adminUser);

        User user = new User();
        user.setNickname("Christian_Taurchini");
        user.setPassword(getEncodedPassword("sincrono"));
        user.setNome("Christian");
        user.setCognome("Taurchini");
        user.setEmail("chritau2001@gmail.com");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userRepository.save(user);
    }

    public User registerNewUser(User user) {
        Role role = roleRepository.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setPassword(getEncodedPassword(user.getPassword()));

        return userRepository.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
