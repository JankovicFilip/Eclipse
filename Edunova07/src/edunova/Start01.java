package edunova;

public class Start01 {
	
	// ovako cu morati ZAVRSNI RAD
	
	
	public static void main(String[] args) {
		// varijabla instance
		// Osoba je tip podatka - klasa a osoba je varijabla
		// new je konstruktor
		// Objekt je instanca klase
		Osoba osoba = new Osoba();
		
		// ovako necemo koristiti
		//osoba.ime ="Pero";
		//System.out.println(osoba.ime);
		// necemo koristiti
		
		
		
		// ispravan nacin rada sa Osoba i start, getter and setter
		osoba.setIme("Pero");
		
		System.out.println(osoba.getIme());
		
		// objekt je kuca u ulici a klasa je nacrt
		
		program();
		
	}
	
	private static void program() {
		// program prvo unosi koliko ce se ukupno osoba unijeti
		// za svaku osobu unosi se sifra, ime, prezime i placa
		// program ispisuje imena i prezimena svih unesenih osoba kao i prosjek place
		
		int ukupnoOsoba = Unos.unesiInt("Unesite koliko osoba");
		Osoba[] osobe = new Osoba[ukupnoOsoba];
		
		// deklaracija instance klase Osoba sa instance varijabe osoba
		Osoba osoba;
		
		for(int i=0;i<ukupnoOsoba;i++) {
			osoba = new Osoba();
			osoba.setSifra(Unos.unesiInt("Unesi sifru " + (i+1) + ". osobe"));
			osoba.setIme(Unos.unesiString("Unesi ime " + (i+1) + ". osobe"));
			osoba.setPrezime(Unos.unesiString("Unesi preime " + (i+1) + ". osobe"));
			osoba.setPlaca(Unos.unesiDouble("Unesi placu " + (i+1) + ". osobe"));
			osobe[i]=osoba;
			
		}
		for(Osoba o: osobe) {
			System.out.println(o.getIme() + " " + o.getPrezime());
			
		}
		System.out.println(prosjek(osobe));
		
	
		
		
	}
	

	// napisati metodu double naziva prosjek koja prima niz osoba i vraca prosjek svih osoba u nizu
	private static double prosjek(Osoba[] niz) {
		double prosjek = 0;		
		
		double suma = 0;
		for(Osoba o:niz) {
			suma+=o.getPlaca();
		}
		prosjek = suma/niz.length;
		
		return prosjek;
		
	}

}
