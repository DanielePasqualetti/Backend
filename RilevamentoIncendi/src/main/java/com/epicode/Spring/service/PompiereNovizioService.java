package com.epicode.Spring.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.PompiereNovizio;
import com.epicode.Spring.repository.PompiereNovizioDAO;

@Service
public class PompiereNovizioService {

	@Autowired PompiereNovizioDAO PNRepo;
	@Autowired @Qualifier("novizio") private ObjectProvider<PompiereNovizio> pompiereNovizioProvider;
	
	public PompiereNovizio salvaNovizio(PompiereNovizio pompiereNovizio) {
		return PNRepo.save(pompiereNovizio);
	}
	
	public List<PompiereNovizio> getNovizi() {
		return (List<PompiereNovizio>) PNRepo.findAll();
	}
}
