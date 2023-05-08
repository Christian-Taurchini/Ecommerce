package it.sincrono.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.sincrono.ecommerce.entity.Anagrafica;
import it.sincrono.ecommerce.service.AnagraficaService;

@RestController
public class AnagraficaController {

	@Autowired
	AnagraficaService anagraficaService;
		
	@DeleteMapping("/anagrafica/{idAnagrafica}")  
	private void deleteAnagrafica(@PathVariable("idAnagrafica") Integer idAnagrafica)   
	{  
		anagraficaService.delete(idAnagrafica);  
	}  
	

	@PostMapping("/nuova/anagrafica")  
	private int saveAnagrafica(@RequestBody Anagrafica anagrafica)   
	{  
		anagraficaService.saveOrUpdate(anagrafica);  
	return anagrafica.getIdAnagrafica();  
	}  
	
	
	@PutMapping("/anagrafica")  
	private Anagrafica update(@RequestBody Anagrafica anagrafica)   
	{  
		anagraficaService.saveOrUpdate(anagrafica);  
	return anagrafica;  
	}  
}
