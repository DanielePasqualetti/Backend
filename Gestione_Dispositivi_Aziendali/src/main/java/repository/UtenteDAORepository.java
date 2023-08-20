package repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import model.Utente;

public interface UtenteDAORepository extends CrudRepository <Utente, Long> {
	
	Utente save(Optional<Utente> u);
	
	boolean existsById(Utente utente);

}
