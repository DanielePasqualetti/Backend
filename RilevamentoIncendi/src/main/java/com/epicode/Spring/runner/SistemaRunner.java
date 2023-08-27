package com.epicode.Spring.runner;

import org.springframework.boot.CommandLineRunner;

import com.epicode.Spring.model.PompiereFactory;

public class SistemaRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		PompiereFactory.creaPompiere("novizio", "Mario", "Rossi", 22);
		PompiereFactory.creaPompiere("novizio", "Giuseppe", "Verdi", 23);
		PompiereFactory.creaPompiere("novizio", "Franco", "Neri", 40);
		
		
	}

}
