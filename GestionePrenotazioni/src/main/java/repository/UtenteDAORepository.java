package repository;

import org.springframework.data.repository.CrudRepository;

import model.Utente;

public interface UtenteDAORepository extends CrudRepository<Utente, Long>{

}
