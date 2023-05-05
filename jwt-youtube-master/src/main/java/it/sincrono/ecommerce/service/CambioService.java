package it.sincrono.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.sincrono.ecommerce.entity.Cambio;
import it.sincrono.ecommerce.repository.CambioRepository;

@Service
public class CambioService {
	
	CambioRepository cambioRepository;

	public List<Cambio> getAllCambi() {
		List<Cambio> cambio = new ArrayList<Cambio>();  
		cambioRepository.findAll().forEach(cambi -> cambio.add(cambi));  
		return cambio;  
		
	}

	public Cambio getCambioById(Integer idCambio) {
		return cambioRepository.findById(idCambio).get(); 
	}

	public void delete(Integer idCambio) {
		cambioRepository.deleteById(idCambio);
		
	}

	public void saveOrUpdate(Cambio cambio) {
		cambioRepository.save(cambio); 
	}

	public void update(Cambio cambio, Integer idCambio)   
	{  
		cambioRepository.save(cambio);  
	} 
	
}
