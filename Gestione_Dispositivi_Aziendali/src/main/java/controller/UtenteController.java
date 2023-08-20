package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Utente;
import service.UtenteService;

@CrossOrigin(origins =  "*", maxAge = 3600)
@RestController
@RequestMapping("/utenti")
public class UtenteController {
	
	@Autowired UtenteService utenteServ;
	
	public ResponseEntity<Utente> aggiungiDispositivo(@PathVariable Long id, @RequestBody Utente utente) throws Exception {
		System.out.println(utente);
		return new ResponseEntity<Utente>(utenteServ.updateUtente(id, utente), HttpStatus.OK);
	}
	
}
