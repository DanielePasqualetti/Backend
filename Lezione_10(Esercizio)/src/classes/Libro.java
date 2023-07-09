package classes;

public class Libro extends Lettura {

	private String autore;
	private String genere;
	
	public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
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
		return "Libro [Autore=" + autore + ", Genere=" + genere + ", Isbn=" + getIsbn() + ", Titolo="
				+ getTitolo() + ", Anno di Pubblicazione=" + getAnnoPubblicazione() + ", Numero di Pagine="
				+ getNumeroPagine() +"]";
	}
	
	public static String stampaFile(Libro libro) {
		return Libro.class.getSimpleName()
				+ "|" + libro.getIsbn()
				+ "|" + libro.getTitolo()
				+ "|" + libro.getAnnoPubblicazione()
				+ "|" + libro.getNumeroPagine()
				+ "|" + libro.getAutore()
				+ "|" + libro.getGenere();
	}
	
	public static Libro caricaFile(String string) {
		String[] valore = string.split("\\|");		
		return new Libro(
				valore[1],
				valore[2],
				Integer.valueOf(valore[3]),
				Integer.valueOf(valore[4]),
				valore[5],
				valore[6]);
	}
}
