package it.sincrono.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.sincrono.ecommerce.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
