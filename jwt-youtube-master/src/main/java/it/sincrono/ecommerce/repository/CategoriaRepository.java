package it.sincrono.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.sincrono.ecommerce.entity.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

}
