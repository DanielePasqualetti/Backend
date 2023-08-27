package com.epicode.Spring.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.PompiereVeterano;
import com.epicode.Spring.repository.PompiereVeteranoDAO;

@Service
public class PompiereVeteranoService {

	@Autowired PompiereVeteranoDAO PVRepo;
	@Autowired @Qualifier("veterano") private ObjectProvider<PompiereVeterano> pompiereVeteranoProvider;
	
	public PompiereVeterano salvaVeterano(PompiereVeterano pompiereVeterano) {
		return PVRepo.save(pompiereVeterano);
	}
	
	public List<PompiereVeterano> getVeterani() {
		return (List<PompiereVeterano>) PVRepo.findAll();
	}
}
