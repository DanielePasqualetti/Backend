package com.epicode.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Veterani")
public class PompiereVeterano implements Pompiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nome;
	private String cognome;
	private Integer eta;
	
	@Override
	public void creaPompiere(String nome, String cognome, Integer eta) {
		// TODO Auto-generated method stub
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		System.out.println("Il Pompiere Veterano " + cognome + " " + nome + " è operativo.");
	}

}
