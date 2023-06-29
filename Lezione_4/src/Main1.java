import classi.Dipartimento;
import classi.Dipendente;
import classi.Livello;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dipendente d1 = new Dipendente(0, Dipartimento.PRODUZIONE);
		d1.stampaDatiDipendente();
		Dipendente d2 = new Dipendente(1, 1300, 35, Livello.IMPIEGATO, Dipartimento.VENDITE);
		d2.stampaDatiDipendente();
		Dipendente d3 = new Dipendente(2, 1200, 35, Livello.IMPIEGATO, Dipartimento.VENDITE);
		d3.stampaDatiDipendente();
		Dipendente d4 = new Dipendente(3, 2500, 35, Livello.DIRIGENTE, Dipartimento.AMMINISTRAZIONE);
		d4.stampaDatiDipendente();
		
		
		d2.promuovi();
		d2.stampaDatiDipendente();
		
		System.out.println(Dipendente.calcolaPaga(d2));
		System.out.println(Dipendente.calcolaPaga(d1, 5));
		System.out.println(Dipendente.calcolaPaga(d3, 2));
	}

}
