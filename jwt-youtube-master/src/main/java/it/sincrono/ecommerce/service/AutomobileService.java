package it.sincrono.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.sincrono.ecommerce.entity.Automobile;
import it.sincrono.ecommerce.repository.AutomobileRepository;

@Service
public class AutomobileService {

	AutomobileRepository automobileRepository;
	
	public List<Automobile> getAllAutomobili() {
		List<Automobile> automobile = new ArrayList<Automobile>();  
		automobileRepository.findAll().forEach(automobili -> automobile.add(automobili));  
		return automobile; 
		}

	public Automobile getAutomobileById(Integer idAutomobile) {
		return automobileRepository.findById(idAutomobile).get(); 
	}

	public void delete(Integer idAutomobile) {
		automobileRepository.deleteById(idAutomobile);
		
	}

	public void saveOrUpdate(Automobile automobile) {
		automobileRepository.save(automobile); 
	}

	public void update(Automobile automobile, Integer idAutomobile)   
	{  
		automobileRepository.save(automobile);  
	} 
	
}
