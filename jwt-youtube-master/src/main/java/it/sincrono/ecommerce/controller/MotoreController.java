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

import it.sincrono.ecommerce.entity.Motore;
import it.sincrono.ecommerce.service.MotoreService;

@RestController
public class MotoreController {
	
	@Autowired 
	MotoreService motoreService;
	
	@GetMapping("/motori")  
	private List<Motore> getAllMotori()   
	{  
	return motoreService.getAllMotori();  
	}  
	
	@GetMapping("/motore/{idMotore}")  
	private Motore getMotore(@PathVariable("idMotore") Integer idMotore)   
	{  
	return motoreService.getMotoreById(idMotore);  
	}
	
	
	@DeleteMapping("/motore/{idMotore}")  
	private void deleteMotore(@PathVariable("idMotore") Integer idMotore)   
	{  
	motoreService.delete(idMotore);  
	}  
	

	@PostMapping("/nuovo/motore")  
	private int saveMotore(@RequestBody Motore motore)   
	{  
	motoreService.saveOrUpdate(motore);  
	return motore.getIdMotore();  
	}  
	
	
	@PutMapping("/motore")  
	private Motore update(@RequestBody Motore motore)   
	{  
		motoreService.saveOrUpdate(motore);  
	return motore;  
	}  
	
}
