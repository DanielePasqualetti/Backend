package service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Edificio;
import model.Postazione;
import model.Tipo;
import repository.PostazioneDAORepository;

@Service
public class PostazioneService {
	
	@Autowired PostazioneDAORepository repo;

	@Autowired @Qualifier("newPostazione") private ObjectProvider<Postazione> newPostazioneProvider;
	
	public Postazione createNewPostazione(String descrizione, Tipo tipo, int numeroMassimoOccupanti, Edificio edificio, boolean libero) {
		System.out.println("Postazione " + descrizione + " in edificio " + edificio + " creata.");
		return Postazione.builder()
				.descrizione(descrizione)
				.tipo(tipo)
				.numeroMassimoOccupanti(numeroMassimoOccupanti)
				.edificio(edificio)
				.libero(libero)
				.build();
	}
	
	public void createPostazioneDB(Postazione p) {
		repo.save(p);
		System.out.println(p.getDescrizione() + " è stata salvata nel DB.");
	}
	
	public void updatePostazioneDB(Postazione p) {
		repo.save(p);
		System.out.println(p.getDescrizione() + " è stata modificata nel DB.");
	}
	
	public void removePostazioneDB(Postazione p) {
		repo.delete(p);
		System.out.println(p.getDescrizione() + " è stata rimossa dal DB.");
	}
	
	public Postazione findPostazioneDB(long id) {
		return repo.findById(id).get();
	}
	
	public List<Postazione> findAllPostazioniDB(){
		return (List<Postazione>) repo.findAll();
	}
	
}
