package utility;

import java.math.BigDecimal;
import java.util.Scanner;

// unos is edunova07


public class Unos {

	public static int unesiInt(Scanner ulaz,String poruka) {
		int i = 0;

		while (true) {
			System.out.println(poruka + " ");
			try {
				i = Integer.parseInt(ulaz.nextLine());
				
			} catch (Exception e) {
				System.out.println("Unos mora biti broj!");
				continue;
			}
			
			if (i < 1) {
				System.out.println("Broj mora biti pozitivan");
				continue;
			}
			return i;
		}

	}
	
	public static int unesiInt(Scanner ulaz,String poruka, int min, int max) {
		int i = 0;

		while (true) {
			System.out.println(poruka + " ");
			try {
				i = Integer.parseInt(ulaz.nextLine());
				
			} catch (Exception e) {
				System.out.println("Unos mora biti broj!");
				continue;
			}
			
			if (i < min || i > max) {
				System.out.println("Broj mora biti izmedu" + min + " i " + max);
				continue;
			}
			return i;
		}

	}

	public static BigDecimal unesiBigDecimal(Scanner ulaz,String poruka) {
		BigDecimal i = BigDecimal.ZERO;

		while (true) {
			System.out.println(poruka + " ");
			try {
				i = new BigDecimal(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Unos mora biti broj!");
				continue;
			}
			
			if (i.compareTo(BigDecimal.ONE)<0) {
				System.out.println( "Broj mora biti pozitivan");
				continue;
			}
			return i;
		}

	}

	public static String unesiString(Scanner ulaz,String poruka) {
		String s = " ";

		while (true) {
			System.out.println(poruka + " ");
			s = ulaz.nextLine();
			if (s.length() == 0) {
				System.out.println("Obavezan unos");
				continue;
			}
			return s;
		}

	}
	public static boolean unesiBoolean(Scanner ulaz, String poruka) {
		boolean b = true;
		while(true) {
			System.out.println(poruka + " ");
			try {
				b =  Boolean.parseBoolean(ulaz.nextLine());
				return b;
			} catch (Exception e) {
				System.out.println("Odgovor mora biti DA ili NE");
				continue;
			}
			
		}
	}

}
