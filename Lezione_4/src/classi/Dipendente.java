package classi;

public class Dipendente {
	
	public static double stipendioBase = 1000;
	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	
	
	
	public Dipendente(int matricola, Dipartimento dipartimento) {
		
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
		
	}
	
	public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
		
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
		
	}
	

	
	
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public static double getStipendioBase() {
		return stipendioBase;
	}

	public int getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public Livello getLivello() {
		return livello;
	}
		
	
	
	public void stampaDatiDipendente() {
		System.out.println("Matricola dipendente = " + matricola +	
							" Stipendio dipendente = " + stipendio + 
							" Importo orario straordinario dipendente = " + importoOrarioStraordinario +
							" Livello professionale dipendente = " + livello +
							" Dipartimento dipendente = " + dipartimento);
	}
	
	
	
	public Livello promuovi() {
		
		switch(livello) {
		
		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			this.stipendio = this.stipendioBase * 1.2;
			System.out.println("Operaio promosso ad impiegato, stipendio base incrementato del 20%.");
			break;
		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			this.stipendio = this.stipendioBase * 1.5;
			System.out.println("Impiegato promosso a quadro, stipendio base incrementato del 50%.");
			break;
		case QUADRO:
			this.livello = Livello.DIRIGENTE;
			this.stipendio = this.stipendioBase * 2;
			System.out.println("Quadro promosso a dirigente, stipendio base incrementato del 100%.");
			break;
		case DIRIGENTE:
			System.out.println("Il dirigente non può essere promosso ulteriormente.");
			break;
		default:
			System.out.println("ERRORE");
		}
		return this.livello;
	}
	
	
	public static double calcolaPaga(Dipendente d) {
		return d.stipendio;
	}
	
	public static double calcolaPaga(Dipendente d, int numeroOreStraordinario) {
		return d.stipendio + (numeroOreStraordinario * d.importoOrarioStraordinario);
	}
	
	
}
