package edunova;

import java.util.Scanner;
// nasljedivanje je kada jedna klase dobije od druge klase public i protected metode

public class JavaSDKKlase {
	// sdk, software development kit
	public JavaSDKKlase() {
		String string = new String("Pero");

		String ime = "Pero";

		Osoba osoba = new Osoba("Pero");

		System.out.println("Osoba");
		System.out.println(osoba.hashCode());
		osoba.setIme("Marko");
		System.out.println(osoba.hashCode());

		// string je mutable class
		System.out.println("String");
		System.out.println(ime.hashCode());
		ime = "Marko";
		System.out.println(ime.hashCode());

		StringBuilder sb = new StringBuilder();
		sb.append("Pero");

		System.out.println("StringBuilder");
		System.out.println(sb.hashCode());
		sb.replace(0, 4, "Marko");
		System.out.println(sb.hashCode());

		String grad = "Osijek";

		// DZ upoznati se sa metodama na string klasi
		// 1. nacin citajuci dokumentaciju
		// 2. nacin je grad. tocka
		// TREBATI CE ZA ZAVRSNI

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi ime osobe ");
		osoba.setIme(ulaz.nextLine());
		System.out.println("Unesi preime osobe ");
		osoba.setPrezime(ulaz.nextLine());
		ulaz.close();  // obavezno ulaz.close jer ce inace biti resource leak
		// losiji nacin
		// system.out.println(osoba.getIme() + " " + osoba.getPrezime());
		
		// bolji nacin
		System.out.println(osoba.getImePrezime()); // pogledaj osoba klasu u e08 linija 28. public string getImePrezime
		
		
		// izvoli mi prezentirati objekt osoba
		// implementacija metode toString u klasi osoba na liniji 33. @override
		System.out.println(osoba);
		
		
		Osoba o1 = new Osoba("Ana");
		Osoba o2 = new Osoba("Ana");
		
		System.out.println(o1.equals(o2)); // ispisuje false jer nema isti hashcode osoba o1 i o2
		// https://docs.oracle.com/javase/7/docs/api/javax/swing/JButton.html NASLJEDIVANJE a.k.a. EXTENDS komanda
		Polaznik polaznik = new Polaznik(); // polaznik ima getIme i getPrezime iz osoba i ima getbrojUgovora iz polaznik
		

	}

	public static void main(String[] args) {
		new JavaSDKKlase();
	}

}
