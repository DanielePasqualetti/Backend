import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import classes.Lettura;
import classes.Libro;
import classes.Periodicita;
import classes.Rivista;

public class Main {

	private static Logger logger = LoggerFactory.getLogger(Main.class);
	
	private Map<String, Lettura> archivioBiblioteca;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CREAZIONE DI LIBRI
		Libro l1 = new Libro("AB001", "Il Signore degli anelli", 1954, 1364, "John R. R. Tolkien", "Fantasy");
		Libro l2 = new Libro("AB002", "IT", 1986, 1315, "Stephen King", "Horror");
		Libro l3 = new Libro("AB042", "Guida galattica per gli autostoppisti", 1979, 224, "Douglas Adams", "Fantascienza");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		//CREAZIONE DI RIVISTE
		Rivista r1 = new Rivista("AB004", "Il satiro scientifico", 2023, 256, Periodicita.SEMESTRALE);
		Rivista r2 = new Rivista("AB005", "National Geographic", 1888, 100, Periodicita.MENSILE);
		Rivista r3 = new Rivista("AB006", "Focus", 1992, 150, Periodicita.SETTIMANALE);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println();
		System.out.println();
		
		//CREO LA MENSOLA
		Main mensola = new Main();
		
		//AGGIUNGO ELEMENTI SULLA MENSOLA
		mensola.aggiungiLettura(l1);
		mensola.aggiungiLettura(l2);
		mensola.aggiungiLettura(r2);
		System.out.println();
		System.out.println();
		
		//CONTROLLO LA MENSOLA
		logger.info("Sulla mensola sono presenti: ");
		for (Lettura lettura : mensola.archivioBiblioteca.values()) {
			logger.info("" + lettura);
	    	}
		
		//RIMUOVO ELEMENTI DALLA MENSOLA
		mensola.rimuoviLettura("AB001");
		mensola.rimuoviLettura("AB002");
		mensola.rimuoviLettura("AB042");
		
		//EFFETTUO UNA RICERCA PER ISBN
		logger.info("" + mensola.ricercaPerIsbn("AB005"));//successo
		logger.info("" + mensola.ricercaPerIsbn("AB004"));//insuccesso null
		
		//EFFETTUO UNA RICERCA PER ANNO
		logger.info("" + mensola.ricercaPerAnno(1888));//successo
		logger.info("" + mensola.ricercaPerAnno(2023));//insuccesso lista vuota
		
		//AGGIUNGO NUOVAMENTE ELEMENTI SULLA MENSOLA
		mensola.aggiungiLettura(l1);
		mensola.aggiungiLettura(l2);
		mensola.aggiungiLettura(r2);
		System.out.println();
		System.out.println();
				
		//EFFETTUO UNA RICERCA PER AUTORE
		logger.info("" + mensola.ricercaPerAutore("John R. R. Tolkien"));//successo
		logger.info("" + mensola.ricercaPerAutore("Douglas Adams"));//insuccesso lista vuota
		
	}
	
	
	public Main() {
		this.archivioBiblioteca = new HashMap<String, Lettura>();
	}
	
	public void aggiungiLettura(Lettura nuovaLettura) {
		archivioBiblioteca.put(nuovaLettura.getIsbn(), nuovaLettura);
		logger.info("Nuova lettura " + nuovaLettura.getIsbn() + ", " + nuovaLettura.getTitolo() + " è stata raggiunta alla mensola.");
	}
	
	public void rimuoviLettura(String isbn) {
		Lettura letturaRimossa = archivioBiblioteca.remove(isbn);
		if (letturaRimossa != null) {
			logger.info("Lettura " + isbn + ", " + letturaRimossa.getTitolo() + " è stata rimossa dalla mensola.");
		} else {
			logger.info("La lettura inserita non è presente sulla mensola.");
		}
	}
	
	public Lettura ricercaPerIsbn(String isbn) {
		//volevo mettere un if else qui dentro per farmi restituire messaggi diversi in caso di 
		//ricerca andata a buon fine o meno ma mi continua a dare errori, spero cosi vada bene
		return archivioBiblioteca.get(isbn);
	}
	
	public List<Lettura> ricercaPerAnno(int annoPubblicazione){
		Integer annoInteger = Integer.valueOf(annoPubblicazione);
		return archivioBiblioteca.values()
				.stream().filter(lett -> annoInteger.equals(lett.getAnnoPubblicazione()))
				.collect(Collectors.toList());
	}
	
	public List<Libro> ricercaPerAutore(String autore){
		return archivioBiblioteca.values()
				.stream()
				.filter(lett -> lett instanceof Libro)
				.map(lett -> (Libro) lett)
				.filter(lett -> autore.equals(lett.getAutore()))
				.collect(Collectors.toList());}
}
