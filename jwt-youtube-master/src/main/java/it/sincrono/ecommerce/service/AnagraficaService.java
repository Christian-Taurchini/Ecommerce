package it.sincrono.ecommerce.service;

import org.springframework.stereotype.Service;

import it.sincrono.ecommerce.entity.Anagrafica;
import it.sincrono.ecommerce.repository.AnagraficaRepository;

@Service
public class AnagraficaService {
	
	AnagraficaRepository anagraficaRepository;

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
