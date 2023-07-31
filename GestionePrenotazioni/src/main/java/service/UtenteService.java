package service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Utente;
import repository.UtenteDAORepository;

@Service
public class UtenteService {
	
	@Autowired UtenteDAORepository repo;
	
	@Autowired @Qualifier("newUtente") private ObjectProvider<Utente> newUtenteProvider;
	
	public Utente createNewUtente(String username, String nomeCompleto, String email) {
		return Utente.builder()
				.username(username)
				.nomeCompleto(nomeCompleto)
				.email(email)
				.build();
	}
	
	public void createUtenteDB(Utente u) {
		repo.save(u);
		System.out.println(u.getNomeCompleto() + " è stato salvato nel DB.");
	}
	
	public void updateUtenteDB(Utente u) {
		repo.save(u);
		System.out.println(u.getNomeCompleto() + " è stato modificato nel DB.");
	}
	
	public void removeUtenteDB(Utente u) {
		repo.delete(u);
		System.out.println(u.getNomeCompleto() + " è stato rimosso dal DB.");
	}
	
	public Utente findUtenteDB(long id) {
		return repo.findById(id).get();
	}
	
	public List<Utente> findAllUtentiDB() {
		return (List<Utente>) repo.findAll();
	}
}
