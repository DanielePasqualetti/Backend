package Esercizio4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci un numero intero: ");
		int num = scan.nextInt();
		
		for (int i = num; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
