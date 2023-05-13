package it.sincrono.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.sincrono.ecommerce.entity.Trazione;
import it.sincrono.ecommerce.repository.TrazioneRepository;

@Service
public class TrazioneService {

	@Autowired  
	TrazioneRepository trazioneRepository;

	public List<Trazione> getAllTrazioni() {
		List<Trazione> trazione = new ArrayList<Trazione>();  
		trazioneRepository.findAll().forEach(trazioni -> trazione.add(trazioni));  
		return trazione;  
	}

	public Trazione getTrazioneById(Integer idTrazione) {
		return trazioneRepository.findById(idTrazione).get();  
	}

	public void delete(Integer idTrazione) {
		trazioneRepository.deleteById(idTrazione); 
	}

	public void saveOrUpdate(Trazione trazione) {
		trazioneRepository.save(trazione); 	
	}

	public void update(Trazione trazione, Integer idTrazione)   
	{  
		trazioneRepository.save(trazione);  
	} 
	
}
