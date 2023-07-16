package controller;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.ElementoLetterario;
import model.Libro;
import model.Periodicita;
import model.Prestito;
import model.Rivista;
import model.Utente;
import utils.JpaUtil;

public class Main {
	
	private static Logger log = LoggerFactory.getLogger(Main.class);
	static EntityManager em = Persistence
			.createEntityManagerFactory("Catalogo_Bibliotecario")
			.createEntityManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro l1 = new Libro();
		l1.setTitolo("Il signore degli anelli");
		l1.setAnnoPubblicazione(1954);
		l1.setNumeroPagine(1364);
		l1.setAutore("Tolkine");
		l1.setGenere("Fantasy");
		//aggiungiElementoLetterario(l1);
		Libro l2 = new Libro();
		l2.setTitolo("IT");
		l2.setAnnoPubblicazione(1986);
		l2.setNumeroPagine(1315);
		l2.setAutore("Stephen King");
		l2.setGenere("Horror");
		//aggiungiElementoLetterario(l2);
		Libro l3 = new Libro();
		l3.setTitolo("Il signore delle mosche");
		l3.setAnnoPubblicazione(1952);
		l3.setNumeroPagine(280);
		l3.setAutore("William Golding");
		l3.setGenere("Romanzo");
		//aggiungiElementoLetterario(l3);
		
		Rivista r1 = new Rivista();
		r1.setTitolo("Il satiro scientifico");
		r1.setAnnoPubblicazione(2023);
		r1.setNumeroPagine(256);
		r1.setPeriodicita(Periodicita.SEMESTRALE);
		//aggiungiElementoLetterario(r1);
		Rivista r2 = new Rivista();
		r2.setTitolo("Focus");
		r2.setAnnoPubblicazione(1992);
		r2.setNumeroPagine(150);
		r2.setPeriodicita(Periodicita.SETTIMANALE);
		//aggiungiElementoLetterario(r2);
		
		Utente u1 = new Utente();
		u1.setNome("Mario");
		u1.setCognome("Rossi");
		u1.setDataNascita(LocalDate.of(1980, 1, 12));
		//aggiungiUtente(u1);
		
		
		Prestito p1 = new Prestito();
		p1.setUtente(u1);
		p1.setLibroPrestato(l1);
		p1.setDataInizioPrestito(LocalDate.of(2023, 7, 16));
		Prestito p2 = new Prestito();
		p2.setUtente(u1);
		p2.setLibroPrestato(l2);
		p2.setDataInizioPrestito(LocalDate.of(2023, 7, 16));
		
		//aggiungiPrestito(p1); ROTTO NON VA E NON CAPISCO PERCHE'
		
		
		
		//rimuoviLibro(1L);
		//rimuoviRivista(2L);
		//ricercaLibroIsbn(1L);
		//ricercaRivistaIsbn(1L);
		//ricercaLibriAnnoPubblicazione(1986);
		//ricercaRivisteAnnoPubblicazione(2023);
		//ricercaLibriPerAutore("Stephen King");
		//ricercaLibriPerTitoloOParteDiEsso("signore");
		
	}
	
	public static void aggiungiElementoLetterario(ElementoLetterario el) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(el);
			em.getTransaction().commit();
		} catch(Exception ex) {
			em.getTransaction().rollback();
			log.error("Errore durante il salvataggio " + ex.getMessage());
		} finally {
			em.close();
		}
	}
	
	public static void rimuoviLibro(Long isbn) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			ElementoLetterario el = em.find(Libro.class, isbn);
			em.getTransaction().begin();
			em.merge(el);
			em.remove(el);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			log.error("Errore nell'eliminazione del libro " + e.getMessage());
		} finally {
			em.close();
		}
	}
	
	public static void rimuoviRivista(Long isbn) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			ElementoLetterario el = em.find(Rivista.class, isbn);
			em.getTransaction().begin();
			em.merge(el);
			em.remove(el);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			log.error("Errore nell'eliminazione della rivista " + e.getMessage());
		} finally {
			em.close();
		}
	}
	
	public static ElementoLetterario ricercaLibroIsbn(Long isbn) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			ElementoLetterario el = em.find(Libro.class, isbn);
			log.info("Elemento trovato" + el);
			return el;
		} finally {
			em.close();
		}
	}
	
	public static ElementoLetterario ricercaRivistaIsbn(Long isbn) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			ElementoLetterario el = em.find(Rivista.class, isbn);
			log.info("Elemento trovato" + el);
			return el;
		} finally {
			em.close();
		}
	}
	
	public static void ricercaLibriAnnoPubblicazione(int anno) {
	    EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	    try {
	        TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.annoPubblicazione = :anno", Libro.class);
	        query.setParameter("anno", anno);
	        List<Libro> listaLibri = query.getResultList();
	        
	        if (!listaLibri.isEmpty()) {
	            log.info("Elementi trovati per l'anno " + anno + ": " + listaLibri.size());
	            for (Libro libro : listaLibri) {
	                log.info(libro.toString());
	            }
	        } else {
	            log.info("Nessun elemento trovato per l'anno " + anno);
	        }
	    } finally {
	        em.close();
	    }
	}


	public static void ricercaRivisteAnnoPubblicazione(int anno) {
	    EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	    try {
	        TypedQuery<Rivista> query = em.createQuery("SELECT r FROM Rivista r WHERE r.annoPubblicazione = :anno", Rivista.class);
	        query.setParameter("anno", anno);
	        List<Rivista> listaRiviste = query.getResultList();
	        
	        if (!listaRiviste.isEmpty()) {
	            log.info("Elementi trovati per l'anno " + anno + ": " + listaRiviste.size());
	            for (Rivista rivista : listaRiviste) {
	                log.info(rivista.toString());
	            }
	        } else {
	            log.info("Nessun elemento trovato per l'anno " + anno);
	        }
	    } finally {
	        em.close();
	    }
	}

	public static void ricercaLibriPerAutore(String autore){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.autore = :autore", Libro.class);
			query.setParameter("autore", autore);
			List<Libro> listaLibri = query.getResultList();
			
			if (!listaLibri.isEmpty()) {
				log.info("Elementi trovati per autore " + autore + ": " + listaLibri.size());
				for (Libro libro : listaLibri) {
	                log.info(libro.toString());
	            }
			} else {
				log.info("Nessun elemento trovato per autore " + autore);
			}
		} finally {
			em.close();
		}
	}
	
	public static void ricercaLibriPerTitoloOParteDiEsso(String titolo) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {
            TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.titolo LIKE :titolo", Libro.class);
            query.setParameter("titolo", "%" + titolo + "%");
            List<Libro> listaLibri = query.getResultList();
            
            if (!listaLibri.isEmpty()) {
                log.info("Elementi trovati per il titolo '" + titolo + "': " + listaLibri.size());
                for (Libro libro : listaLibri) {
                    log.info(libro.toString());
                }
            } else {
                log.info("Nessun elemento trovato per il titolo '" + titolo + "'");
            }
        } finally {
            em.close();
        }
    }
	
	public static void aggiungiUtente(Utente u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
		} catch(Exception ex) {
			em.getTransaction().rollback();
			log.error("Errore durante il salvataggio " + ex.getMessage());
		} finally {
			em.close();
		}
	}
	
	public static void aggiungiPrestito(Prestito p) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
		} catch(Exception ex) {
			em.getTransaction().rollback();
			log.error("Errore durante il salvataggio " + ex.getMessage());
		} finally {
			em.close();
		}
	}
}
