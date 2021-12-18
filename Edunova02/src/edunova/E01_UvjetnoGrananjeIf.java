package edunova;

public class E01_UvjetnoGrananjeIf {
	public static void main(String[] args) {

		int i = 10;

		boolean uvjet = i < 7;

		// ovo nije uobicajna syntaksa
		if (uvjet) {
			System.out.println("OK 1");
		}

		// uobicajena sintaksa
		if (i <= 7) {
			System.out.println("OK 2");
		}

		if (i < 7) {
			System.out.println("OK 3");
		} else {
			System.out.println("OK 4");
		}

		// ako se if primjenjuje samo na 1. red nakon ifa onda ne trebaju ()
		if (i == 7)
			System.out.println("OK 5");
		System.out.println("OK 6"); // ova linija se izvodi bez obzira na if

		int j = 0, k = 1;

		if (i > 10 & k == 1) {
			System.out.println("OK 7");
		}

		// 1 & uvijek provjerava oba uvjeta dok
		// 2 && u slucaju ne zadovoljavanja prvog uvjeta drugi se ne provjerava

		if (i > 10 && k == 1) {
			System.out.println("OK 8");
		}

		// or je | shift plys backslash pored entera
		if (i == 1 | i == 10) {
			System.out.println("OK 9");
		}

		// jedan | provjerava oba uvjeta
		// dva || u slucaju zadovoljavanja prvog uvjeta ne proverava drugi

		if (i == 1 || i == 10) {
			System.out.println("OK 10");
		}
		// not je ! usklicnik
		if (!(i < 7)) {
			System.out.println("OK 11");
		}

		// puna sintaksa if naredbe

		if (i == 1) {
			System.out.println("Nedovoljan");
		} else if (i == 2) {
			System.out.println("dovoljan");
		} else if (i == 3) {
			System.out.println("Dobar");
		} else {
			System.out.println("Ovo nitko nece dobiti");
		}

		// if naredbe se mogu ugnjezdivati
		if (i < 7) {
			int t = 3;
			System.out.println("OK 12");

			if (t > 3) {
				System.out.println("OK 13");
			}
		}
		// System.out.println(t); t nije vidjlji izvan svog if bloka u kojem je
		// deklariran

		// inline if, tercijarni operator ?
		int a = 12;

		if (a == 12) {
			System.out.println("DA");
		} else {
			System.out.println("Ne");
		}
		// inline if brzi
		System.out.println(a == 12 ? "DA" : "NE");
		
		

	}

}
