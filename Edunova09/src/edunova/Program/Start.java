package edunova.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import utility.Unos;

public class Start {
	
	// na razini klase deklariraj a u konstruktoru konstruiraj
	private List<Mobitel> mobiteli;
	private Scanner ulaz;
	private Mobitel mobitel;
	
	
	public Start() {
		mobiteli= new ArrayList<>();
		ulaz = new Scanner(System.in);
		//pocetniPodaci();
		program();
		ulaz.close(); // za scanner da prestane raditi
		
	}
	
	// private void pocetniPodaci() {
		
		
	// }

	private void program() {
		naslov();
		izbornik();
		
	}

	private void izbornik() {
		System.out.println("\n1. Unos Mobitela");
		System.out.println("\n2. Promjena Mobitela");
		System.out.println("\n3. Brisanje Mobitela");
		System.out.println("\n4. Pregled Mobitela");
		// crud. create repeat update delete
		System.out.println("\n5. Izlaz iz programa");
		// dz staru switch sintaksu prepraviti u novu
		
		switch (Unos.unesiInt(ulaz, "Odaberite akciju")) {
		case 1:
			unos();
			break;
		case 2:
			promjena();
			break;
		case 3:
			brisanje();
			break;
		case 4:
			pregled();
			izbornik();
			break;
		case 5:
			System.out.println("\nHvala sto ste koristili nas program, dovidenja");
			break;
		default:
			System.out.println("Nije dobra opcija izbornika");
			izbornik();
		
		}
		
	}

	private void pregled() {
		int b = 1;
		
		for(Mobitel m: mobiteli) {
			System.out.println(b++ + ". " +m);
		}
		
		
	}

	private void brisanje() {
		pregled();
		mobiteli.remove(Unos.unesiInt(ulaz,"Odaberi redni broj mobitela koji zelis obrisati")-1);
		izbornik();
		
	}

	private void promjena() {
		pregled();
		int i = Unos.unesiInt(ulaz,"Unesi redni broj mobitela kojeg zelis mjenjati");
		mobitel = mobiteli.get(i-1);
		mobitel.setNaziv(Unos.unesiString(ulaz,"Promijeni naziv (" + mobitel.getNaziv() +")"));
		// implementirati sifre  i cijenu
		izbornik();
	
	}

	private void unos() {
		mobitel = new Mobitel();
		mobitel.setSifra(Unos.unesiInt(ulaz,"Ucitaj sifru mobitela"));
		mobitel.setNaziv(Unos.unesiString(ulaz,"Unesi naziv mobitela"));
		mobitel.setCijena(Unos.unesiBigDecimal(ulaz,"Ucitaj cijenu mobitela"));
		mobiteli.add(mobitel);
		izbornik();
		
	}

	private void naslov() {
		System.out.println("************************");
		System.out.println("**Program Mobiteli V1***");
		System.out.println("************************");
	}

	public static void main(String[] args) {
		new Start();
	}
}
