package it.sincrono.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.sincrono.ecommerce.entity.Trazione;

@Repository
public interface TrazioneRepository extends CrudRepository<Trazione, Integer>{

}
