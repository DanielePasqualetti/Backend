package service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Edificio;
import repository.EdificioDAORepository;

@Service
public class EdificioService {
	
	@Autowired EdificioDAORepository repo;
	
	@Autowired @Qualifier("newEdificio")private ObjectProvider<Edificio> newEdificioProvider;
	
	public Edificio createNewEdificio(String nome, String indirizzo, String citta) {
		System.out.println("Edificio " + nome + " creato.");
		return Edificio.builder()
				.nome(nome)
				.indirizzo(indirizzo)
				.citta(citta)
				.build();
	}
	
	public void createEdificioDB(Edificio e) {
		repo.save(e);
		System.out.println(e.getNome() + " è stato salvato nel DB.");
	}
	
	public void updateEdificioDB(Edificio e) {
		repo.save(e);
		System.out.println(e.getNome() + " è stato modificato nel DB.");
	}
	
	public void removeEdificioDB(Edificio e) {
		repo.delete(e);
		System.out.println(e.getNome() + " è stato rimosso dal DB.");
	}
	
	public Edificio findEdificioDB(long id) {
		return repo.findById(id).get();
	}
	
	public List<Edificio> findAllEdificiDB() {
		return (List<Edificio>) repo.findAll();
	}
}
