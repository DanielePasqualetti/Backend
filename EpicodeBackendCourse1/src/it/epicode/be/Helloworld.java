package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

	static Scanner scan = new Scanner(System.in);
	
public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(moltiplica(2,5));
		System.out.println(concatena("blabla",5));
		
		String[] arrFive = {"dsaf ", "asdqw ", "asd ","vaasdvds ","qwedq "};
		String[] resInserisciInArray = inserisciInArray(arrFive , "Test ");
		for (int i = 0; i < resInserisciInArray.length; i++) {
			System.out.print(resInserisciInArray[i]);
			};
		
		soluzioneScanner1();
		soluzioneScanner2();
		
		System.out.println(perimetroRettangolo(2.431,4.412));
		System.out.println(pariDispari(31));
		System.out.println(pariDispari(52));
		System.out.println(perimetroTriangolo(3.32,4.12,4.55));
		
		}


public static int moltiplica(int x, int y)
	{
	int result = x * y;
	return result;
	}

public static String concatena(String str1, int y)
	{
	String result = str1 + y;
	return result;
	}

public static String[] inserisciInArray(String[] x, String y) {
	String[] arr = new String[6];
	//Soluzione 1
	arr[0] = x[0];
	arr[1] = x[1];
	arr[2] = x[2];
	arr[3] = y;
	arr[4] = x[3];
	arr[5] = x[4];
	
	//Soluzione 2
	for(int i=0; i<x.length; i++) {
		if(i == 3) {
			arr[i] = y;
		} else {
			arr[i] = x [i];
		}
	}
	return arr;
}

public static void soluzioneScanner1() {
	System.out.print("Qual è il tuo nome? ");
	String nome = scan.nextLine();
	
	System.out.print("Qual è il tuo cognome? ");
	String cognome = scan.nextLine();
	
	System.out.print("Quanti anni hai? ");
	String eta = scan.nextLine();
	
	System.out.println("Ciao " + nome + " " + cognome + ". Hai " + eta + " anni giusto?");
}

public static void soluzioneScanner2() {
	System.out.print("Qual è il tuo nome? ");
	String nome = scan.nextLine();

	System.out.print("Qual è il tuo cognome? ");
	String cognome = scan.nextLine();

	System.out.print("Quanti anni hai? ");
	String eta = scan.nextLine();
	
	System.out.println("Hai " + eta + " anni giusto?" + " Ciao " + nome + " " + cognome);
}

public static double perimetroRettangolo(double x, double y)
	{
	double result = (x*2) + (y*2);
	return result;
	}

public static int pariDispari(int x) {
	if (x % 2 == 0) {
		return 0;
	} else {
		return 1;
	}
};

public static double perimetroTriangolo(double x, double y, double z) {
	double p = (x+y+z)/2;
	double result = Math.sqrt(p*(p-x)*(p-y)*(p-z));
	return result;
}

}

