package viseOblicje;

public class Start {
	
	public Start() { // konstruktor
		Polaznik polaznik = new Polaznik();
		polaznik.setIme("Marija");
		polaznik.setPrezime("Jak");
		polaznik.setBrojUgovora("12/2022");
		
		Predavac predavac = new Predavac();
		predavac.setIme("Ana");
		predavac.setPrezime("Malj");
		predavac.setIban("HR12341234123412");
		
		Osoba[] niz = new Osoba[2];
		niz[0] = polaznik;
		niz[1] = predavac;
		
		predstaviIh(niz);
		
		
		
	}
	
	private void predstaviIh(Osoba[] niz) {
		for(Osoba o:niz) {
			// manifestacija polimorfizma iliti viseoblicje
			System.out.println(o.predstaviSe());
		}
		
	}

	public static void main(String[] args) {
		new Start();
		
	}

}
