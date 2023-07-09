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

	public static String stampaFile(Rivista rivista) {
		return Rivista.class.getSimpleName()
				+ "|" + rivista.getIsbn()
				+ "|" + rivista.getTitolo()
				+ "|" + rivista.getAnnoPubblicazione()
				+ "|" + rivista.getNumeroPagine()
				+ "|" + rivista.getPeriodicita();
	}
	
	public static Rivista caricaFile(String string) {
		String[] valore = string.split("\\|");		
		return new Rivista(
				valore[1],
				valore[2],
				Integer.valueOf(valore[3]),
				Integer.valueOf(valore[4]),
				Periodicita.valueOf(valore[5]));
	}
}
