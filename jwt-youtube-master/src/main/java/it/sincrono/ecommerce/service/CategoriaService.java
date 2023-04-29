package it.sincrono.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.sincrono.ecommerce.entity.Categoria;
import it.sincrono.ecommerce.repository.CategoriaRepository;  

@Service
public class CategoriaService {
	
	@Autowired  
	CategoriaRepository categoriaRepository;
	
	public List<Categoria> getAllCategorie() {
	
		List<Categoria> categoria = new ArrayList<Categoria>();  
		categoriaRepository.findAll().forEach(categorie -> categoria.add(categorie));  
		return categoria;  
		
	}

	public Categoria getCategoriaById(Integer idCategoria) {
		return categoriaRepository.findById(idCategoria).get();  
	}

	public void delete(Integer idCategoria) {
		categoriaRepository.deleteById(idCategoria); 
	}

	public void saveOrUpdate(Categoria categoria) {
		categoriaRepository.save(categoria); 	
	}

	public void update(Categoria categoria, Integer idCategoria)   
	{  
		categoriaRepository.save(categoria);  
	}  
	
}
