package it.sincrono.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
}
