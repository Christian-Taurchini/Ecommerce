package it.sincrono.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.sincrono.ecommerce.entity.Anagrafica;

@Repository
public interface AnagraficaRepository extends CrudRepository<Anagrafica, Integer>{

}
