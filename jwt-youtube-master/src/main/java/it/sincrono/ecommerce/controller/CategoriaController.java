package it.sincrono.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import it.sincrono.ecommerce.entity.Categoria;
import it.sincrono.ecommerce.service.CategoriaService;

public class CategoriaController {

	@Autowired  
	CategoriaService categoriaService;  
	
	
	@GetMapping("/categorie")  
	private List<Categoria> getAllCategorie()   
	{  
	return categoriaService.getAllCategorie();  
	}  
	
	
	@GetMapping("/categoria/{idCategoria}")  
	private Categoria getCategoria(@PathVariable("idCategoria") long idCategoria)   
	{  
	return categoriaService.getCategoriaById(idCategoria);  
	}
	
	
	@DeleteMapping("/categoria/{idCategoria}")  
	private void deleteCategoria(@PathVariable("idCategoria") long idCategoria)   
	{  
	categoriaService.delete(idCategoria);  
	}  
	

	@PostMapping("/categoria")  
	private int saveBook(@RequestBody Categoria categoria)   
	{  
	categoriaService.saveOrUpdate(categoria);  
	return categoria.getCategoriaid();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/categoria")  
	private Categoria update(@RequestBody Categoria categoria)   
	{  
		categoriaService.saveOrUpdate(categoria);  
	return categoria;  
	}  
	
}
