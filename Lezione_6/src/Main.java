import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo l'arrqy
		int[] array = new int[5];
		
		//genero randomicamente i numeri
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
		}
		
		//stampo l'array generato randomicamente
		System.out.println("Array iniziale:");
		stampaArray(array);
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int posizione;
		boolean continua = true;
		while (continua) {
			
            //chiedo all'utente di inserire la posizione
            System.out.print("Premere 0 per uscire altrimenti inserisci la posizione (1-5): ");
            posizione = scan.nextInt() - 1;
            if (posizione == -1) {
            	break;
            }
            if (posizione < 0 || posizione >= array.length) {
                System.out.println("Posizione non valida!");
            } else if (posizione != -1) {
                try {
                    //chiedo all'utente di inserire il numero da sostituire
                    System.out.print("Inserisci il numero da sostituire (0-10): ");
                    int num = scan.nextInt();

                    if (num < 0 || num > 10) {
                        throw new IllegalArgumentException("Numero non valido!");
                    }

                    array[posizione] = num;

                    //stampo i nuovi valori dell'array
                    System.out.println("Nuovo stato dell'array:");
                    stampaArray(array);
                } catch (IllegalArgumentException e) {
                    System.out.println("Errore: " + e.getMessage());
                }
            } else {
                continua = false;
            }
        }

        System.out.println("Programma terminato.");
		
	}
	
	
	public static void stampaArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			}
		System.out.println();
	}
}
