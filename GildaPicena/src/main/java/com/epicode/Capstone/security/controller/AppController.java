package com.epicode.Capstone.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Capstone.security.entity.Tavolo;
import com.epicode.Capstone.security.service.MasterService;
import com.epicode.Capstone.security.service.TavoloService;
import com.epicode.Capstone.security.service.UserService;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired MasterService mSvc;
	@Autowired TavoloService tSvc;
	@Autowired UserService uSvc;
	
	@PostMapping("/tavoli/new")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> creaTavolo(@RequestBody Tavolo t) {
		Tavolo tavolo = tSvc.creaTavolo(t.getMaster(), t.getGioco(), t.getStato());
		return new ResponseEntity<Tavolo> (tavolo, HttpStatus.OK);
	}
	
	
	
}
