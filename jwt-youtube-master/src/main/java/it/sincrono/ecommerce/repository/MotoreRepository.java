package it.sincrono.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.sincrono.ecommerce.entity.Motore;

@Repository
public interface MotoreRepository extends CrudRepository<Motore, Integer>{

}
