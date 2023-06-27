public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rettangolo rettangolo1 = new Rettangolo(25,54);
		Rettangolo rettangolo2 = new Rettangolo(43,62);
		
		System.out.println("Stampa l'area ed il perimetro di ogni rettangolo");
		stampaRettangolo(rettangolo1);
		stampaRettangolo(rettangolo2);
		System.out.println("-------------------------------------");
		stampaDueRettangoli(rettangolo1, rettangolo2);
	}
	
	public static void stampaRettangolo(Rettangolo r) {
		System.out.println("L'area è: " + r.calcolaArea());
		System.out.println("Il perimetro è: " + r.calcolaPerimetro());
	}
	
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		System.out.println("L'area del primo rettangolo è: " + r1.calcolaArea() + ". Il perimetro è: " + r1.calcolaPerimetro());
		System.out.println("L'area del secondo rettangolo è: " + r2.calcolaArea() + ". Il perimetro è: " + r2.calcolaPerimetro());
		System.out.println("La somma delle aree dei due rettangoli è: " + (r1.calcolaArea() + r2.calcolaArea()));
		System.out.println("La somma dei perimetri dei due rettangoli è: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
	}
}
