package it.sincrono.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import it.sincrono.ecommerce.service.MotoreService;

@RestController
public class MotoreController {
	
	@Autowired 
	MotoreService motoreService;
	
}
