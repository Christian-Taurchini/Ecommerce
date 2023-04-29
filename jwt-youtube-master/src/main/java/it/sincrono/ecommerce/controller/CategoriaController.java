package it.sincrono.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.sincrono.ecommerce.entity.Categoria;
import it.sincrono.ecommerce.service.CategoriaService;

@RestController
public class CategoriaController {

	@Autowired  
	CategoriaService categoriaService;  
	
	
	@GetMapping("/categorie")  
	private List<Categoria> getAllCategorie()   
	{  
	return categoriaService.getAllCategorie();  
	}  
	
	
	@GetMapping("/categoria/{idCategoria}")  
	private Categoria getCategoria(@PathVariable("idCategoria") Integer idCategoria)   
	{  
	return categoriaService.getCategoriaById(idCategoria);  
	}
	
	
	@DeleteMapping("/categoria/{idCategoria}")  
	private void deleteCategoria(@PathVariable("idCategoria") Integer idCategoria)   
	{  
	categoriaService.delete(idCategoria);  
	}  
	

	@PostMapping("/nuova/categoria")  
	private int saveCategoria(@RequestBody Categoria categoria)   
	{  
	categoriaService.saveOrUpdate(categoria);  
	return categoria.getIdCategoria();  
	}  
	
	
	@PutMapping("/categoria")  
	private Categoria update(@RequestBody Categoria categoria)   
	{  
		categoriaService.saveOrUpdate(categoria);  
	return categoria;  
	}  
	
}
