package controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Dispositivo;
import service.DispositivoService;
import service.UtenteService;

@CrossOrigin(origins =  "*", maxAge = 3600)
@RestController
@RequestMapping("/altro")
public class DispositivoController {

	@Autowired DispositivoService dispositivoServ;
	@Autowired UtenteService utenteServ;
	@PostMapping(value = "/nuovodispositivo")
	public ResponseEntity<Dispositivo> creaDispositivo(@RequestBody Dispositivo dispositivo) {
		Dispositivo d = dispositivoServ.creaDispositivo(dispositivo);
		System.out.println(d);
		return new ResponseEntity<Dispositivo>(d, HttpStatus.CREATED);
	}
}
