package classes;

public class Rivista extends Lettura {

	private Periodicita periodicita;

	public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
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
