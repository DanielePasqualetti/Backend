package model;

import javax.persistence.Entity;

@Entity
public class Libro extends ElementoLetterario {

	private String autore;
	private String genere;
	
	public Libro(String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
		super(titolo, annoPubblicazione, numeroPagine);
		// TODO Auto-generated constructor stub
		this.autore = autore;
		this.genere = genere;
	}
	
	public Libro() {
		super();
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + "]";
	}

	
	
}
