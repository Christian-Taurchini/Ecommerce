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

import it.sincrono.ecommerce.entity.Trazione;
import it.sincrono.ecommerce.service.TrazioneService;

@RestController
public class TrazioneController {
	
	@Autowired 
	TrazioneService trazioneService;
	
	@GetMapping("/lista/trazione")  
	private List<Trazione> getAllTrazioni()   
	{  
	return trazioneService.getAllTrazioni();  
	}  
	
	
	@GetMapping("/trazione/{idTrazione}")  
	private Trazione getCambio(@PathVariable("idTrazione") Integer idTrazione)   
	{  
	return trazioneService.getTrazioneById(idTrazione);  
	}
	
	
	@DeleteMapping("/trazione/{idCambio}")  
	private void deleteTrazione(@PathVariable("idTrazione") Integer idTrazione)   
	{  
		trazioneService.delete(idTrazione);  
	}  
	

	@PostMapping("/nuova/trazione")  
	private int saveTrazione(@RequestBody Trazione trazione)   
	{  
		trazioneService.saveOrUpdate(trazione);  
	return trazione.getIdTrazione();  
	}  
	
	
	@PutMapping("/trazione")  
	private Trazione update(@RequestBody Trazione trazione)   
	{  
		trazioneService.saveOrUpdate(trazione);  
	return trazione;  
	} 
}
