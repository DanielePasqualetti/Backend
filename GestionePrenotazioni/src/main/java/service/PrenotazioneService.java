package service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Edificio;
import model.Postazione;
import model.Prenotazione;
import model.Utente;
import repository.PrenotazioneDAORepository;

@Service
public class PrenotazioneService {
	
	@Autowired PrenotazioneDAORepository repo;
	
	@Autowired @Qualifier("newPrenotazione") private ObjectProvider<Prenotazione> newPrenotazioneProvider;
	
	public Prenotazione createNewPrenotazione(LocalDate giorno, Utente utente, Edificio edificio, Postazione postazione) {
		return Prenotazione.builder()
				.giorno(giorno)
				.utente(utente)
				.edificio(edificio)
				.postazione(postazione)
				.build();
	}
	
	public void createPrenotazioneDB(Prenotazione p) {
		repo.save(p);
		System.out.println("Prenotazione salvata nel DB.");
	}
	
	public void updatePrenotazioneDB(Prenotazione p) {
		repo.save(p);
		System.out.println("Prenotazione modificata nel DB.");
	}
	
	public void removePrenotazioneDB(Prenotazione p) {
		repo.delete(p);
		System.out.println("Prenotazione rimossa dal DB.");
	}
	
	public Prenotazione findPrenotazioneDB(long id) {
		return repo.findById(id).get();
	}
	
	public List<Prenotazione> findAllEdificiDB() {
		return (List<Prenotazione>) repo.findAll();
	}
	
}
