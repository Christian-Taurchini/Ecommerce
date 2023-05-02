package it.sincrono.ecommerce.controller;

import it.sincrono.ecommerce.entity.User;
import it.sincrono.ecommerce.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

    @PostMapping({"/registrazione"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @GetMapping({"/admin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "Url accessibile all'admin";
    }

    @GetMapping({"/home"})
    @PreAuthorize("hasRole('Utente')")
    public String forUser(){
        return "Home Page Ecommerce";
    }
     
}
