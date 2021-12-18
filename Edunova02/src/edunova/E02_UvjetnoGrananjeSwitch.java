package edunova;

import javax.swing.JOptionPane;

public class E02_UvjetnoGrananjeSwitch {

	public static void main(String[] args) {

		int ocjena = 2;

		switch (ocjena) {
		case 1:
			System.out.println("Ne dovoljan");
			break; // obavezno break nakon case
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 4:
			System.out.println("Vrlo dobar");
			break;
		case 5:
			System.out.println("Odlican");
			break;
		default: // moze i ne mora biti
			System.out.println("Nije ocjena");

		}

		int iznos = 10;
		switch (iznos) {
		case 2:
		case 3:
		case 4:
			System.out.println("OK");
			break;
		case 1:
		case 5:
			System.out.println("NE");
			break;

		default:
			System.out.println("Ne valja");

		}

		// stara switch sintaksa

		int ulaz = Integer.parseInt(JOptionPane.showInputDialog("Odaberi akciju: \n1 zbrajanje \n2 oduzimanje"));
		switch (ulaz) {
		case 1:
			int b1 = 2;
			int b2 = 3;
			System.out.println(b1 + b2);
			break;
		case 2:
			float f1 = 3.71F;
			float f2 = 3.22F;
			System.out.println(f1 / f2);
			break;
		default:
			System.out.println("Nisi odabrao valjanu akciju");

		}
		int rez = switch (ulaz) {
		case 1, 2, 3 -> 10; // -> oznaka da ce se vratiti vrijednost 10 -> bi u ovom primjeru rez
		case 4, 5 -> 20;
		default -> 0;
		}; // kada radimo case 1,2,3 itd onda na kraju } mora biti ; znaci ovako };
	}

}
