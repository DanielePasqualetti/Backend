package com.epicode.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epicode.Spring.controller.CentralePompieriController;

@SpringBootApplication
public class RilevamentoIncendiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RilevamentoIncendiApplication.class, args);
		
		System.out.println("Servizio di rilevamento incendi della stazione dei pompieri è attivo.");
        
		CentralePompieriController c = new CentralePompieriController();
		c.getSonde();
	}

}
