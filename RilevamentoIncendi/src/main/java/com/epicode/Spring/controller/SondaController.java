package com.epicode.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.model.Sonda;
import com.epicode.Spring.service.SondaService;

@RestController
@RequestMapping("/sonda")
public class SondaController {
	
	@Autowired SondaService sondaService;
	
	public ResponseEntity<Sonda> salvaSonda(@RequestBody Sonda sonda) {
		Sonda s = sondaService.salvaSonda(sonda);
		System.out.println(sonda);
		return new ResponseEntity<Sonda>(s, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Sonda>> getSonde() {
		List<Sonda> s = sondaService.getSonde();
		s.forEach(sonda -> System.out.println(sonda.toString()));
		return new ResponseEntity<List<Sonda>>(s, HttpStatus.OK);
	}
}
