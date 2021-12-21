package edunova;

import java.util.Arrays;

public class E01_JednodimenzionalniNiz {
	
	public static void main(String[] args) {
		
		// ako zelimo pohraniti temperuature u godini
		
		// ako je potrebno pohraniti vise vrijednosti isto tipa podatka tada koristimo niz
		
		int[] temperature = new int [12]; //glavna karakteristika niza je  to sto se  u startu mora
		System.out.println(temperature.length);
		
		System.out.println(Arrays.toString(temperature));
		
		// drugi nacin inicijalizacije
		
		//int niz[] = new int [5];
		
		// vrijednosti se dodjeljuju pomocu indeksa koji krece od broja 0
		temperature[0] = -1; // sijecanj
		temperature[1] = -2;
		temperature[2] = 3;
		temperature[3] = 9;
		temperature[4] = 14;
		temperature[5] = 21;
		temperature[6] = 29;
		temperature[7] = 32;
		temperature[8] = 27;
		temperature[9] = 15;
		temperature[10] = 6;
		temperature[11] = 2; //prosinac
		
		//ispisati temperaturu u prosincu
		
		System.out.println(temperature[11]);
		
		
		
		System.out.println(Arrays.toString(temperature));
		
		//prva vrijednost vam je uvijek od nule
		System.out.println(temperature[0]);
		
		// zadnja vrijednost je uvijek .length-1
		System.out.println(temperature[temperature.length-1]);
		
		int[] ocjene = {3,2,4,5,3,1,2,5,6,4};
		System.out.println(Arrays.toString(ocjene));
		
		System.out.println(ocjene[ocjene.length-1]);
		
		ocjene[ocjene.length-1] =5;
		
		
		
		
		
	}

}
