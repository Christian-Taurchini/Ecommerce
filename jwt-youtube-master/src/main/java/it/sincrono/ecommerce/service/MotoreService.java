package it.sincrono.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.sincrono.ecommerce.entity.Motore;
import it.sincrono.ecommerce.repository.MotoreRepository;

@Service
public class MotoreService {

	@Autowired  
	MotoreRepository motoreRepository;

	public List<Motore> getAllMotori() {
		List<Motore> motore = new ArrayList<Motore>();  
		motoreRepository.findAll().forEach(motori -> motore.add(motori));  
		return motore;  
	}

	public Motore getMotoreById(Integer idMotore) {
		return motoreRepository.findById(idMotore).get();  
	}

	public void delete(Integer idMotore) {
		motoreRepository.deleteById(idMotore); 
	}

	public void saveOrUpdate(Motore motore) {
		motoreRepository.save(motore); 	
	}

	public void update(Motore motore, Integer idMotore)   
	{  
		motoreRepository.save(motore);  
	}  
	
}
