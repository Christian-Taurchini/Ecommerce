package it.sincrono.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.sincrono.ecommerce.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {

}
