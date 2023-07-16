package model;

import javax.persistence.Entity;

@Entity
public class Rivista extends ElementoLetterario {

	private Periodicita periodicita;

	public Rivista(String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(titolo, annoPubblicazione, numeroPagine);
		// TODO Auto-generated constructor stub
		this.periodicita = periodicita;
	}
	
	public Rivista() {
		super();
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", Isbn=" + getIsbn() + ", Titolo=" + getTitolo()
				+ ", Anno di Pubblicazione=" + getAnnoPubblicazione() + ", Numero di Pagine=" + getNumeroPagine()
				+ "]";
	}

}
