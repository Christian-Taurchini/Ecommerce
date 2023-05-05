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

import it.sincrono.ecommerce.entity.Automobile;
import it.sincrono.ecommerce.service.AutomobileService;

@RestController
public class AutomobileController {

	@Autowired 
	AutomobileService automobileService;
	
	@GetMapping("/automobili")  
	private List<Automobile> getAllAutomobili()   
	{  
	return automobileService.getAllAutomobili();  
	}  
	
	
	@GetMapping("/automobile/{idAutomobile}")  
	private Automobile getAutomobile(@PathVariable("idAutomobile") Integer idAutomobile)   
	{  
	return automobileService.getAutomobileById(idAutomobile);  
	}
	
	
	@DeleteMapping("/automobile/{idAutomobile}")  
	private void deleteAutomobile(@PathVariable("idAutomobile") Integer idAutomobile)   
	{  
	automobileService.delete(idAutomobile);  
	}  
	

	@PostMapping("/nuova/automobile")  
	private int saveAutomobile(@RequestBody Automobile automobile)   
	{  
		automobileService.saveOrUpdate(automobile);  
	return automobile.getIdAutomobile();  
	}  
	
	
	@PutMapping("/automobile")  
	private Automobile update(@RequestBody Automobile automobile)   
	{  
		automobileService.saveOrUpdate(automobile);  
	return automobile;  
	}  
	
}
