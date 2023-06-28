package Esercizio1;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String stringa1 = "pari";
	String stringa2 = "dispari";
	
	System.out.println(stringaPariDispari(stringa1));
	System.out.println(stringaPariDispari(stringa2));
	
	
	System.out.println("*************************************");
	
	
	int anno1 = 96;
	int anno2 = 400;
	int anno3 = 366;
	
	System.out.println(annoBisestile(anno1));
	System.out.println(annoBisestile(anno2));
	System.out.println(annoBisestile(anno3));
	}

	public static boolean stringaPariDispari(String str) {
		int lunghezza = str.length();
		if (lunghezza % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0) {
			return true;
		} else if (((anno % 100) == 0) && ((anno % 400) == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
