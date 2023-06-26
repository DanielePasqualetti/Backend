package com.epicode;

public class MainProject {

	public static void main(String[] args) {
		// Istruzioni del mio programma
		/*
		 * commenti 
		 * multilinea
		 * 
		 */
		
		/**
		 * @author Daniele Pasqualetti
		 * commenti JAVADOC
		 */
		
		boolean b = true; //true/false;
		char c = 'c'; //apici singoli, un carattere
		int i = 25; //valore numerico non decimale
		double d = 25.5; //valore numerico decimale
		String s = "ciao"; //apici doppi, una stringa
		
		
		int val1 = 10; //dichiarare ed inizializzare una variabile
		int val2; //dichiarato una variabile
		val2 = 10; //inizializzato una variabile
		final int VAL3 = 15; //definisco ed inizializzo una costante
		
		int[] arrNum =  new int[5]; //creo un array di valori numerici di dimensione fissa (5) con indice da 0 a n-1
		arrNum[0] = 25; //inizializzo un valore nell'indice 0 del mio array
		arrNum[1] = 10; //inizializzo un valore nell'indice 0 del mio array
		System.out.println(arrNum[1]); //stampo il valore in console
		String[] arrString = new String[3]; //creo un array di valori numerici di dimensione fissa (5) con indice da 0 a n-1
		
		char[] arrChar = {'a','b','c'}; //creo un array e lo popolo immediatamente con dei valori
		
		for (int j=0; j<arrChar.length; j++) {
			System.out.println(arrChar[j]);
		}
		
		
		//valore di int è più piccolo di long (in termini di memoria) altrimenti devo fare il cast io con le parentesi 
		int num1 = 25;//cast implicito
		int num2 = num1;//cast implicito
		long num3 = 193;//cast implicito
		int num4 = (int) num3;//cast esplicito
		double num5 = num4; //193.0 cast implicito
		int num6 = (int) num5; // 193 cast esplicito
		
		//let c = 10/3; //3.33333333333333
		int cj = 10/3; //3
		int resto = 10/3; //1
		
		num1 = num1 + 5;
		num1 += 5;
		
		num1 = num1 - 5;
		num1 -= 5;
		
		num1 = num1 *5;
		num1 *= 5;
		
		num1 = num1 / 5;
		num1 /= 5;
		
		num1 = num1 % 5;
		num1 %= 5;
		
		boolean cond1 = 5 > 0 && 5 < 10; //true && true -> true
		boolean cond2 = 5 > 0 || 5 > 10; //true && false -> true
		boolean cond3 = !(5 > 10); //!false -> true
		boolean cond4 = 5 > 10 ^ 5 < 10; //true && false -> true per essere vera solo una delle condizioni deve essere falsa
	
		
		
		
		int res = somma(25,10);
		System.out.println(res);
		stampaSomma(25,10);
	
		
	}
		
	
	
		
		public static int somma (int x, int y) {
			int result = x + y;
			return result;
		}
		
		public static void stampaSomma (int x, int y) {
			int result = x + y;
			System.out.println(result);
		}
	}


