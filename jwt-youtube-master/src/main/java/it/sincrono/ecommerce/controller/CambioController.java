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

import it.sincrono.ecommerce.entity.Cambio;
import it.sincrono.ecommerce.service.CambioService;

@RestController
public class CambioController {

	@Autowired 
	CambioService cambioService;
	
	@GetMapping("/lista/cambi")  
	private List<Cambio> getAllCambi()   
	{  
	return cambioService.getAllCambi();  
	}  
	
	
	@GetMapping("/cambio/{idCambio}")  
	private Cambio getCambio(@PathVariable("idCambio") Integer idCambio)   
	{  
	return cambioService.getCambioById(idCambio);  
	}
	
	
	@DeleteMapping("/cambio/{idCambio}")  
	private void deleteCambio(@PathVariable("idCambio") Integer idCambio)   
	{  
		cambioService.delete(idCambio);  
	}  
	

	@PostMapping("/nuovo/cambio")  
	private int saveCambio(@RequestBody Cambio cambio)   
	{  
	cambioService.saveOrUpdate(cambio);  
	return cambio.getIdCambio();  
	}  
	
	
	@PutMapping("/cambio")  
	private Cambio update(@RequestBody Cambio cambio)   
	{  
		cambioService.saveOrUpdate(cambio);  
	return cambio;  
	}  
}
