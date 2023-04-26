package it.sincrono.ecommerce.service;

import it.sincrono.ecommerce.entity.Role;
import it.sincrono.ecommerce.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role createNewRole(Role role) {
        return roleRepository.save(role);
    }
}
