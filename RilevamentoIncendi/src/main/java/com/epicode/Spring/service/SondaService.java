package com.epicode.Spring.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.Sonda;
import com.epicode.Spring.repository.SondaDAO;

@Service
public class SondaService {
	
	@Autowired SondaDAO sondaRepo;
	@Autowired @Qualifier("sonda") private ObjectProvider<Sonda> sondaProvider;
	
	public Sonda salvaSonda(Sonda sonda) {
		return sondaRepo.save(sonda);
	}
	
	public List<Sonda> getSonde() {
		return (List<Sonda>) sondaRepo.findAll();
	}
	
}
