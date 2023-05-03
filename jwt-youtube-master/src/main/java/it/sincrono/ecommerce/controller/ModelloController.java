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

import it.sincrono.ecommerce.entity.Modello;
import it.sincrono.ecommerce.service.ModelloService;



@RestController
public class ModelloController {

	@Autowired  
	ModelloService modelloService;  
	
	
	@GetMapping("/modelli")  
	private List<Modello> getAllModelli()   
	{  
	return modelloService.getAllModelli();  
	}  
	
	@GetMapping("/modello/{idModello}")  
	private Modello getCategoria(@PathVariable("idModello") Integer idModello)   
	{  
	return modelloService.getModelloById(idModello);  
	}
	
	
	@DeleteMapping("/modello/{idModello}")  
	private void deleteModello(@PathVariable("idModello") Integer idModello)   
	{  
	modelloService.delete(idModello);  
	}  
	

	@PostMapping("/nuovo/modello")  
	private int saveModello(@RequestBody Modello modello)   
	{  
	modelloService.saveOrUpdate(modello);  
	return modello.getIdModello();  
	}  
	
	
	@PutMapping("/modello")  
	private Modello update(@RequestBody Modello modello)   
	{  
		modelloService.saveOrUpdate(modello);  
	return modello;  
	}  
	
}
