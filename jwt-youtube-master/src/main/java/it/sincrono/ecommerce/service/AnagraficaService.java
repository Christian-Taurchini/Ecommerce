package it.sincrono.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import it.sincrono.ecommerce.entity.Anagrafica;
import it.sincrono.ecommerce.repository.AnagraficaRepository;

public class AnagraficaService {
	
	AnagraficaRepository anagraficaRepository;

	public List<Anagrafica> getAllAnagrafiche() {
		List<Anagrafica> anagrafica = new ArrayList<Anagrafica>();  
		anagraficaRepository.findAll().forEach(anagrafiche -> anagrafica.add(anagrafiche));  
		return anagrafica; 
	}

	public Anagrafica getAnagraficaById(Integer idAnagrafica) {
		return anagraficaRepository.findById(idAnagrafica).get(); 
	}

	public void delete(Integer idAnagrafica) {
		anagraficaRepository.deleteById(idAnagrafica);
		
	}

	public void saveOrUpdate(Anagrafica anagrafica) {
		anagraficaRepository.save(anagrafica);
		
	}

	public void update(Anagrafica anagrafica, Integer idAnagrafica)   
	{  
		anagraficaRepository.save(anagrafica);  
	} 
	
}
