package Esercizio2;

public class Sim {

	int numeroTelefono;
	double credito;
	Chiamata[] ultimeChiamate;
	
public Sim(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		this.credito = 0;
		this.ultimeChiamate = new Chiamata[5];
	}

public void datiSim() {
	System.out.println("Dati Sim");
	System.out.println("Il numero corrispondente a questa Sim è: " + this.numeroTelefono);
	System.out.println("Il credito di questa Sim è: " + this.credito);
	System.out.println("Le ultime 5 chiamate effettuate con questa Sim sono ai numeri: " + this.ultimeChiamate);
}

}

