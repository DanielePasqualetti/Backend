import java.util.HashSet;

import java.util.Scanner;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di elementi da inserire: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consuma il carattere di nuova riga

        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci la parola " + (i + 1) + ": ");
            String parola = scanner.nextLine();

            if (!parole.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate:");
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        int numeroParoleDistinte = parole.size() - paroleDuplicate.size();
        System.out.println("Numero di parole distinte: " + numeroParoleDistinte);

        System.out.println("Elenco delle parole distinte:");
        for (String parola : parole) {
            System.out.println(parola);
        }
	}

}
