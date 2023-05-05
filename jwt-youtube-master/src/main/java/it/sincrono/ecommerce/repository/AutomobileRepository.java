package it.sincrono.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.sincrono.ecommerce.entity.Automobile;

@Repository
public interface AutomobileRepository extends CrudRepository<Automobile, Integer>{

}
