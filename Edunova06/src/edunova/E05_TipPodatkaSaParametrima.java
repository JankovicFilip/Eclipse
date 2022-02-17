package edunova;

public class E05_TipPodatkaSaParametrima {
	
	public static void main(String[] args) {
		
		System.out.println(zbroji(E04_TipPodatkaBezParametara.ucitajBroj(),
				E04_TipPodatkaBezParametara.ucitajBroj()));
		// prvo se izvodi prvi ucitaj broj, pa drugi pa se zbroji i ispisuje, bez sysout i icega drugog jer to imam u drugoj metodi
		System.out.println(sumaPrimBrojeva(3,100)); // pozvao sa metode na liniji 29
		
		System.out.println(najmanji(E04_TipPodatkaBezParametara.ucitajNiz()));
	}

	private static int zbroji(int i, int j) {
		return i+j;
	}
	
	private static boolean prim(int broj) {
		// metoda ce biti zaduzena da vrati dali je prim ili nije
		for(int i=2;i<broj;i++) {
			if(broj%i==0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	private static int sumaPrimBrojeva(int min, int max) { // vidi se da sumira nesto a provjera je izvucena je u drugoj metodi, linija 17
		int suma = 0;
		
		for(int i=min;i<=max;i++) {
			if(prim(i)) {
				suma+=i;
			}
		}
		
		
		return suma;
	}
	
	
	// metodu koja u nizu brojevu nalazi najmanj broj
	
	private static int najmanji(int[] niz) {
		int najmanji = Integer.MAX_VALUE;
		
		for(int i: niz) {
			if(i<najmanji) {
				najmanji=i;
			}
		}
		
		
		return najmanji;
	}
	
	
	
	
}
