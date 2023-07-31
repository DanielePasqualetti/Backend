package runner;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import model.Edificio;
import model.Postazione;
import model.Prenotazione;
import model.Tipo;
import model.Utente;
import service.EdificioService;
import service.PostazioneService;
import service.PrenotazioneService;
import service.UtenteService;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired EdificioService edificioservice;
	@Autowired PostazioneService postazioneservice;
	@Autowired UtenteService utenteservice;
	@Autowired PrenotazioneService prenotazioneservice;
	
	Logger log = LoggerFactory.getLogger(Runner.class);
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Runner...");
		
		System.out.println();
		System.out.println("SEDI");
		System.out.println();
		Edificio sedeRoma = edificioservice.createNewEdificio("Sede 1", "Via Repubblica 1", "Roma");
		Edificio sedeMilano = edificioservice.createNewEdificio("Sede 2", "Via Martiri della Resistenza 1", "Milano");
		Edificio sedePalermo = edificioservice.createNewEdificio("Sede 3", "Via Dei Mille 1", "Palermo");
		
		//stampo gli edifici
		log.info(sedeRoma.toString());
		log.info(sedeMilano.toString());
		log.info(sedePalermo.toString());
		
		
		System.out.println();
		System.out.println("POSTAZIONI");
		System.out.println();
		
		//ROMA
		Postazione postRoma1 = postazioneservice.createNewPostazione("Privata", Tipo.PRIVATO, 1, sedeRoma, true);
		Postazione postRoma2 = postazioneservice.createNewPostazione("Openspace", Tipo.OPENSPACE, 7, sedeRoma, true);
		Postazione postRoma3 = postazioneservice.createNewPostazione("Privata", Tipo.SALA_RIUNIONI, 20, sedeRoma, true);
		
		//MILANO
		Postazione postMilano1 = postazioneservice.createNewPostazione("Privata", Tipo.PRIVATO, 1, sedeMilano, true);
		Postazione postMilano2 = postazioneservice.createNewPostazione("Openspace", Tipo.OPENSPACE, 7, sedeMilano, true);
		Postazione postMilano3 = postazioneservice.createNewPostazione("Privata", Tipo.SALA_RIUNIONI, 20, sedeMilano, true);
		
		//PALERMO
		Postazione postPalermo1 = postazioneservice.createNewPostazione("Privata", Tipo.PRIVATO, 1, sedePalermo, true);
		Postazione postPalermo2 = postazioneservice.createNewPostazione("Openspace", Tipo.OPENSPACE, 7, sedePalermo, true);
		Postazione postPalermo3 = postazioneservice.createNewPostazione("Privata", Tipo.SALA_RIUNIONI, 20, sedePalermo, true);
		
		//stampo le postazioni
		log.info(postRoma1.toString());
		log.info(postRoma2.toString());
		log.info(postRoma3.toString());
		log.info(postMilano1.toString());
		log.info(postMilano2.toString());
		log.info(postMilano3.toString());
		log.info(postPalermo1.toString());
		log.info(postPalermo2.toString());
		log.info(postPalermo3.toString());
		
		
		System.out.println();
		System.out.println("UTENTI");
		System.out.println();
		Utente utente1 = utenteservice.createNewUtente("Mr R", "Mario Rossi", "m.rossi@example.com");
		Utente utente2 = utenteservice.createNewUtente("Mr V", "Giuseppe Verdi", "g.verdi@example.com");
		Utente utente3 = utenteservice.createNewUtente("Mr N", "Francesco Neri", "f.neri@example.com");
		
		//stampo gli utenti
		log.info(utente1.toString());
		log.info(utente2.toString());
		log.info(utente3.toString());
		
		
		System.out.println();
		System.out.println("PRENOTAZIONI");
		System.out.println();
		Prenotazione pren1 = prenotazioneservice.createNewPrenotazione(LocalDate.of(2023, 7, 30), utente1, sedePalermo, postPalermo3);
		Prenotazione pren2 = prenotazioneservice.createNewPrenotazione(LocalDate.of(2023, 7, 31), utente2, sedeRoma, postRoma2);
		Prenotazione pren3 = prenotazioneservice.createNewPrenotazione(LocalDate.of(2023, 8, 1), utente3, sedeMilano, postMilano1);
		
		//stampo lòe prenotazioni
		log.info(pren1.toString());
		log.info(pren2.toString());
		log.info(pren3.toString());
		
		
		
		
		//INSERISCO I DATI NEL DB
		//edifici
		edificioservice.createEdificioDB(sedeRoma);
		edificioservice.createEdificioDB(sedeMilano);
		edificioservice.createEdificioDB(sedePalermo);
		
		//postazioni
		postazioneservice.createPostazioneDB(postRoma1);
		postazioneservice.createPostazioneDB(postRoma2);
		postazioneservice.createPostazioneDB(postRoma3);
		postazioneservice.createPostazioneDB(postMilano1);
		postazioneservice.createPostazioneDB(postMilano2);
		postazioneservice.createPostazioneDB(postMilano3);
		postazioneservice.createPostazioneDB(postPalermo1);
		postazioneservice.createPostazioneDB(postPalermo2);
		postazioneservice.createPostazioneDB(postPalermo3);
		
		//utenti
		utenteservice.createUtenteDB(utente1);
		utenteservice.createUtenteDB(utente2);
		utenteservice.createUtenteDB(utente3);
		
		//prenotazioni
		prenotazioneservice.createPrenotazioneDB(pren1);
		prenotazioneservice.createPrenotazioneDB(pren2);
		prenotazioneservice.createPrenotazioneDB(pren3);
		
	}

}
