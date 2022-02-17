package program;
import java.util.ArrayList;
import java.util.List;

import model.Sastojak;
import model.Sendvic;
import subota.Zadaci;

public class Start {

	 
	public static void main(String[] args) {
		Zadaci zadaci = new Zadaci();
		Sendvic sendvic = new Sendvic();
		
		sendvic.setNaziv("Obicni");
		List<Sastojak> sastojci = new ArrayList<>();
		Sastojak s = new Sastojak();
		
		s.setNaziv("Pecivo");
		s.setKolicina(10);
		sastojci.add(s);
		
		s.setNaziv("Baranjski kulen");
		s.setKolicina(3);
		sastojci.add(s);
		
		s.setNaziv("Ajvar");
		s.setKolicina(2);
		sastojci.add(s);
		
		s.setNaziv("Kupus");
		s.setKolicina(1);
		sastojci.add(s);
		
		sendvic.setSastojci(sastojci);
		
		System.out.println(sendvic.getNaziv() +  " " + sendvic.getTezina());
		
		
		
		sendvic = new Sendvic();
		
		sendvic.setNaziv("Pileci");
		sastojci = new ArrayList<Sastojak>();
		
		s = new Sastojak("kulen", 20);
		sastojci.add(s);
		sastojci.add(new Sastojak("Salata",10));
		sastojci.add(new Sastojak("Prsut",20));
		sastojci.add(new Sastojak("Ketchup",20));
		sendvic.setSastojci(sastojci); // AKO SE NE STAVI OVAKO ONDA BACA NULL POINTER EXCEPTION || RADI UVIJEK OVAKO
		
		
		System.out.println(sendvic);
		
		System.out.println(sendvic.getProsjecnaTezinaSastojka());

		
	}
	

}
