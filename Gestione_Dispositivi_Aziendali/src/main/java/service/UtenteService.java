package service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enumerators.Stato;
import model.Dispositivo;
import model.Utente;
import repository.DispositivoDAORepository;
import repository.UtenteDAORepository;

@Service
public class UtenteService {
	
	@Autowired UtenteDAORepository utenteRepo;
	@Autowired DispositivoDAORepository dispositivoRepo;
	
	public Utente updateUtente(Long id, Utente utente) throws Exception {
		// TODO Auto-generated method stub
		if(!utenteRepo.existsById(id) && !utenteRepo.existsById(utente.getId())) {
			System.out.println("Errore, utente non trovato.");
			throw new Exception();
		}
		Utente u = utenteRepo.findById(id).orElse(null);
		
		Set<Dispositivo> dispositivi = (Set<Dispositivo>) utente.getDispositivo();
		Set<Dispositivo> uDispositivi = new HashSet();
		dispositivi.forEach(d -> {
			Dispositivo dispositivo = dispositivoRepo.findById(d.getId()).orElse(null);
			if(dispositivo.getStato() == Stato.DISPONIBILE){
				uDispositivi.add(dispositivo);			
		}
			else {
				System.out.println("Si è verificato un errore. Non è possibile assegnare questo dispositivo!");
			}
		});
		u.setDispositivi(uDispositivi);
		return utenteRepo.save(u);
	}
	
}
