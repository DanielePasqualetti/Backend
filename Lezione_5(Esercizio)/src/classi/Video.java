package classi;

import java.util.Scanner;

import interfacce.ILuminosita;
import interfacce.IRiproducibile;

public class Video extends ElementoMultimediale implements ILuminosita, IRiproducibile {

	public int durata;
	public int volume;
	public int luminosita;
	
	
	public Video(String titolo, int durata, int volume, int luminosita) {
		
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
		this.luminosita = luminosita;
		
	}
	
	public static Video creaVideo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dai un titolo al Video: ");
		String titolo = scan.next();
		System.out.println("Dai una durata al Video (Valori da 1 a 5): ");
		int durata = scan.nextInt();
		System.out.println("Dai un volume al Video (Valori da 1 a 5): ");
		int volume = scan.nextInt();
		System.out.println("Dai una luminosità al Video (Valori da 1 a 5): ");
		int luminosita = scan.nextInt();
		System.out.println("Video " + titolo + " creato.");
		System.out.println();
		return new Video(titolo, durata, volume, luminosita);
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (int i = 0; i < durata; i++) {
			System.out.print("Video " + titolo);
			
			for (int j = 0; j< volume; j++) {
				System.out.print("!");
				
			}
				for (int k = 0; k < luminosita; k++) {
					System.out.print("*");
				}
		System.out.println();
		}
	System.out.println();
	}

	@Override
	public void alzaVolume() {
		// TODO Auto-generated method stub
		if (volume < 5) {
		volume++;
		
		} else {
			System.out.println("Volume già al massimo");
			System.out.println();
		}
	}

	@Override
	public void abbassaVolume() {
		// TODO Auto-generated method stub
		if (volume > 0) {
		volume--;
			
		} else {
			System.out.println("Volume già al minimo");
			System.out.println();
		}
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
	}
	
	
}
