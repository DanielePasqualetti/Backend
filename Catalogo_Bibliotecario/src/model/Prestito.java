package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prestito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Utente utente;
	@ManyToOne
    @JoinColumn(name = "isbn", nullable = true)
	private Libro libroPrestato;
	@ManyToOne
    @JoinColumn(name = "isbn", nullable = true)
	private Rivista rivistaPrestata;
	private LocalDate dataInizioPrestito;
	private LocalDate dataRestituzionePrevista;
	@Column(nullable = true)
	private LocalDate dataRestituzioneEffettiva;
	
	public Prestito(Utente utente, Libro libroPrestato, Rivista rivistaPrestata, LocalDate dataInizioPrestito, LocalDate dataRestituzioneEffettiva) {
		super();
		this.utente = utente;
		this.libroPrestato = libroPrestato;
		this.rivistaPrestata = rivistaPrestata;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}
	
	public Prestito() {
		super();
	}

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Libro getLibroPrestato() {
		return libroPrestato;
	}
	public void setLibroPrestato(Libro libroPrestato) {
		this.libroPrestato = libroPrestato;
	}
	public Rivista getRivistaPrestata() {
		return rivistaPrestata;
	}
	public void setRivistaPrestata(Rivista rivistaPrestata) {
		this.rivistaPrestata = rivistaPrestata;
	}
	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}
	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}
	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}
	
	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}
	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}
	
	
}
