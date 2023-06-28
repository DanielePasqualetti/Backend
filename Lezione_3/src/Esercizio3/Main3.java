package Esercizio3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Inserisci una stringa: ");
			String stringa1 = scan.nextLine();
			
			if (stringa1.equals(":q")) {
				break;
			}
			
			String[] caratteri = stringa1.split("");
			
			for (int i = 0; i < caratteri.length; i++) {
				System.out.print(caratteri[i] + ",");
			}
			System.out.println();
		}
		System.out.println("Fine esecuzione del programma.");		
	}

}
