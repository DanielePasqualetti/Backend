package classi;

import java.util.Scanner;

import interfacce.IRiproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements IRiproducibile {

	public int durata;
	public int volume;
	
	
	public RegistrazioneAudio(String titolo, int durata, int volume) {
		
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
		
	}
	
	public static RegistrazioneAudio creaRegistrazioneAudio() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dai un titolo alla Registrazione Audio: ");
		String titolo = scan.next();
		System.out.println("Dai una durata alla Registrazione Audio (Valori da 1 a 5): ");
		int durata = scan.nextInt();
		System.out.println("Dai un volume alla Registrazione Audio (Valori da 1 a 5): ");
		int volume = scan.nextInt();
		System.out.println("Registrazione Audio " + titolo + " creata.");
		System.out.println();
		return new RegistrazioneAudio(titolo, durata, volume);
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (int i = 0; i < durata; i++) {
			System.out.print("Audio " + titolo);
			
			for (int j = 0; j < volume; j++) {
				System.out.print("!");
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
	
	
}
