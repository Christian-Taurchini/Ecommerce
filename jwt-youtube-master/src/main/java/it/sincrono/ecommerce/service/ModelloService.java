package it.sincrono.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.sincrono.ecommerce.entity.Modello;
import it.sincrono.ecommerce.repository.ModelloRepository;


@Service
public class ModelloService {
	
	@Autowired  
	ModelloRepository modelloRepository;

	public List<Modello> getAllModelli() {
		List<Modello> modello = new ArrayList<Modello>();  
		modelloRepository.findAll().forEach(modelli -> modello.add(modelli));  
		return modello;  
	}

	public Modello getModelloById(Integer idModello) {
		return modelloRepository.findById(idModello).get();  
	}

	public void delete(Integer idModello) {
		modelloRepository.deleteById(idModello); 
	}

	public void saveOrUpdate(Modello modello) {
		modelloRepository.save(modello); 	
	}

	public void update(Modello modello, Integer idModello)   
	{  
		modelloRepository.save(modello);  
	}  
}
