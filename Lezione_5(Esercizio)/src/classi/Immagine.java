package classi;

import java.util.Scanner;

import interfacce.ILuminosita;

public class Immagine extends ElementoMultimediale implements ILuminosita {
	
	public int luminosita;
	
	
	public Immagine(String titolo, int luminosita) {
		
		this.titolo = titolo;
		this.luminosita = luminosita;
		
	}
	
	public static Immagine creaImmagine() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dai un titolo all'immagine: ");
		String titolo = scan.next();
		System.out.println("Dai una luminosità all'immagine (Valori da 1 a 5): ");
		int luminosita = scan.nextInt();
		System.out.println("Immagine " + titolo + " creata.");
		System.out.println();
		return new Immagine(titolo, luminosita);
	}
	
	public void show() {
		
		System.out.print("Immagine " + titolo);
		for (int i = 0; i < luminosita; i++) {
			System.out.print("*");
			}
		System.out.println();
		System.out.println();
	}
	
	@Override
	public void aumentaLuminosita() {
		// TODO Auto-generated method stub
		if (luminosita < 5) {
		luminosita++;
		} else {
			System.out.println("Luminosità già al massimo");
			System.out.println();
		}
	}

	@Override
	public void diminuisciLuminosita() {
		// TODO Auto-generated method stub
		if (luminosita > 0) {
		luminosita--;
		} else {
			System.out.println("Luminosità già al minimo");
			System.out.println();
		}
	};
	

}
