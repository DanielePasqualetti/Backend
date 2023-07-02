package esercizio;

import java.util.Scanner;

import classi.ElementoMultimediale;
import classi.Immagine;
import classi.RegistrazioneAudio;
import classi.Video;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TEST IMMAGINE
		Immagine immagine1 = new Immagine("TestImm1", 3);
		immagine1.show();
		immagine1.aumentaLuminosita();
		immagine1.aumentaLuminosita();
		immagine1.show();
		immagine1.aumentaLuminosita();
		Immagine immagine2 = new Immagine("TestImm2", 3);
		immagine2.show();
		immagine2.diminuisciLuminosita();
		immagine2.diminuisciLuminosita();
		immagine2.show();
		immagine2.diminuisciLuminosita();
		immagine2.show();
		immagine2.diminuisciLuminosita();
		
		//TEST REGISTRAZIONEAUDIO
		RegistrazioneAudio audio1 = new RegistrazioneAudio("TestAudio1", 3, 3);
		audio1.alzaVolume();
		audio1.play();
		audio1.alzaVolume();
		audio1.play();
		audio1.alzaVolume();
		RegistrazioneAudio audio2 = new RegistrazioneAudio("TestAudio2", 3, 3);
		audio2.abbassaVolume();
		audio2.play();
		audio2.abbassaVolume();
		audio2.play();
		audio2.abbassaVolume();
		audio2.play();
		audio2.abbassaVolume();
		
		//TEST VIDEO
		Video video1 = new Video("TestVideo1", 3, 4, 5);
		video1.alzaVolume();
		video1.play();
		video1.alzaVolume();
		video1.aumentaLuminosita();
		Video video2 = new Video("TestVideo2", 3, 2, 1);
		video2.abbassaVolume();
		video2.play();
		video2.abbassaVolume();
		video2.play();
		video2.abbassaVolume();
		video2.diminuisciLuminosita();
		video2.play();
		video2.diminuisciLuminosita();
		
		
		
		/*
		 * Non sono riuscito a creare dei check per valori non validi (tipo oltre il 3 all'inizio ed oltre il 5 al player vero e proprio), 
		 * mi continuava a dare errore quindi alla fine ho mollato, tanto non era richiesto,
		 * cosi funziona ma bisogna inserire i valori corretti altrimenti si rompe e bisogna farlo ripartire
		 * */
		
		//PLAYER MULTIMEDIALE 
		ElementoMultimediale[] mp4 = new ElementoMultimediale[5];
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		
		while(n < mp4.length) {
			
			System.out.println("Seleziona il numero relativo all'oggetto che vuoi creare.");
			System.out.println("1. Immagine");
			System.out.println("2. Registrazione Audio");
			System.out.println("3. Video");
			System.out.print("Cosa vuoi creare? ");
		
			int scelta = scan.nextInt();
		
		
			
		switch (scelta) {
			case 1:
//				System.out.println("Dai un titolo all'immagine: ");
//				String titolo1 = scan.next();
//				System.out.println("Dai una luminosità all'immagine (Valori da 1 a 5): ");
//				int luminosita1 = scan.nextInt();
//				LettoreMultimediale immagine = new Immagine(titolo1, luminosita1);
//				mp4[n] = new LettoreMultimediale(titolo1, luminosita1);
//				System.out.println("Immagine " + titolo1 + " creata.");
//				System.out.println();
//				immagine.show();
				mp4[n] = Immagine.creaImmagine();
				break;
			case 2:
//				System.out.println("Dai un titolo alla Registrazione Audio: ");
//				String titolo2 = scan.next();
//				System.out.println("Dai una durata alla Registrazione Audio (Valori da 1 a 5): ");
//				int durata2 = scan.nextInt();
//				System.out.println("Dai un volume alla Registrazione Audio (Valori da 1 a 5): ");
//				int volume2 = scan.nextInt();
//				RegistrazioneAudio registrazioneAudio = new RegistrazioneAudio(titolo2, durata2, volume2);
//				mp4[n] = new LettoreMultimediale(titolo2, durata2, volume2);
//				System.out.println("Registrazione Audio " + titolo2 + " creata.");
//				System.out.println();
//				registrazioneAudio.play();
				mp4[n] = RegistrazioneAudio.creaRegistrazioneAudio();
				break;
			case 3:
//				System.out.println("Dai un titolo al Video: ");
//				String titolo3 = scan.next();
//				System.out.println("Dai una durata al Video (Valori da 1 a 5): ");
//				int durata3 = scan.nextInt();
//				System.out.println("Dai un volume al Video (Valori da 1 a 5): ");
//				int volume3 = scan.nextInt();
//				System.out.println("Dai una luminosità al Video (Valori da 1 a 5): ");
//				int luminosita3 = scan.nextInt();
//				Video video = new Video(titolo3, durata3, volume3, luminosita3);
//				mp4[n] = new LettoreMultimediale(titolo3, durata3, volume3, luminosita3);
//				System.out.println("Video " + titolo3 + " creato.");
//				System.out.println();
//				video.play();
				mp4[n] = Video.creaVideo();
				break;
			default:
				System.out.println("Scelta non valida.");
				System.out.println();
		}
		n++;
	}
		
		
		
		while(true) {
			System.out.println("Premere 0 per stoppare il riproduttore.");
			System.out.println("Oppure: ");
			for (int i = 0; i < mp4.length; i++) {
				System.out.println("Premere " + (i + 1) + " per riprodurre " + mp4[i].getTitolo());
			}
			
			
			int traccia = scan.nextInt() - 1;
			
			if(traccia == -1) {
				System.out.println("Riproduttore fermato.");
				break;
			} else if (mp4[traccia] instanceof Immagine) {
				Immagine immagine = (Immagine) mp4[traccia];
				immagine.show();
			} else if (mp4[traccia] instanceof RegistrazioneAudio) {
				RegistrazioneAudio audio = (RegistrazioneAudio) mp4[traccia];
				audio.play();
			} else if (mp4[traccia] instanceof Video) {
				Video video = (Video) mp4[traccia];
				video.play();
			}
			
			
		}
		
		
	}

}
