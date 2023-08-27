package com.epicode.Spring.model;

public class PompiereFactory {
	
	public static Pompiere creaPompiere(String competenza, String nome, String cognome, Integer eta) {
		if(competenza == null) {
			return null;
		}
		else if(competenza.equalsIgnoreCase("novizio")) {
			PompiereNovizio novizio = new PompiereNovizio();
			novizio.creaPompiere(nome, cognome, eta);
			return novizio;
		}
		else if(competenza.equalsIgnoreCase("veterano")) {
			PompiereVeterano veterano = new PompiereVeterano();
			veterano.creaPompiere(nome, cognome, eta);
			return veterano;
		}
		return null;
	}

}
