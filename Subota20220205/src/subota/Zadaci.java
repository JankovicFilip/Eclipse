package subota;

import java.util.Scanner;

public class Zadaci {
	public Zadaci() {
		//char a = 'T';
		// zadatak ispisati sve brojeve od 1 - 100 i ciji zbrojevi znamenaka su 7
		// int suma = 1;
		// int desetica;
		// int jedinica;

		// while(suma < 100) {
		// desetica = suma / 10;
		// jedinica = suma % 10;
		// if(desetica + jedinica == 0) {
		// System.out.println(suma);
		// }
		// suma++;
		// }

		// ucitati text koji je minimalno duzine 5 znakova

		//Scanner ulaz = new Scanner(System.in);
		//System.out.println("Unesi poruku");
		//String s = " ";
		//String poruka = ulaz.nextLine();
		//System.out.println("Unesi poruku");
		//poruka = ulaz.nextLine();
		//while (poruka.length() < 5) {
			//System.out.println("Molim vas unesite minimalno 5 znakova");
		//}
		//ulaz.close();
		

		//System.out.println(zadatak2(2, "Osijek"));
		
		//zadatak3();
		zadatak4();
	}

	private char zadatak2(int index, String b) {
		// metoda vraca znak koji se nalazi na primljenom indexu
		
		System.out.println(index);
		System.out.println(b);
		
		return b.charAt(index - 1);

	}
	// ne prima nijedan parametar tipa void
	private void zadatak3() {
		// ispisi sve neparne brojeve od 56 do 12
		int i = 56, y=12;
		do{
			if(i%2!=0) {
				System.out.println(i);
				
			}
			
		}while (i-->y);			
		
		
	}
	
	private void zadatak4() {
		int i = 1, j = 2, k=0;
		k=++i + j--;
		i= k - ++j;
		System.out.println(i+j+k);
		
	}
	
	
	

	public static void main(String[] args) {
		new Zadaci();

	}
}
