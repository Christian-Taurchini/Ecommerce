package it.sincrono.ecommerce.service;

import it.sincrono.ecommerce.entity.Role;
import it.sincrono.ecommerce.repository.RoleDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
//ignora