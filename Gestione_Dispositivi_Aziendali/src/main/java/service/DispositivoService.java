package service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Dispositivo;
import repository.DispositivoDAORepository;

@Service
public class DispositivoService {
	
	@Autowired DispositivoDAORepository dispositivoRepo;
	@Autowired @Qualifier("dispositivo") private ObjectProvider<Dispositivo> dispositivoProvider;
	
	public Dispositivo creaDispositivo(Dispositivo dispositivo) {
		return dispositivoRepo.save(dispositivo);
	}
	
}
