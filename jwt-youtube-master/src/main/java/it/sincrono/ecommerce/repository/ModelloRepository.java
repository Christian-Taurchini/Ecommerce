package it.sincrono.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.sincrono.ecommerce.entity.Modello;


@Repository
public interface ModelloRepository extends CrudRepository<Modello, Integer>{
	
}
