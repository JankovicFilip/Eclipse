package edunova;

import javax.swing.JOptionPane;

public class UcenjeKomandi {
	public static void main(String[] args) {
		int dob = Integer.parseInt(
				JOptionPane.showInputDialog("Koje si godiste")
				);
		int rad = Integer.parseInt(
				JOptionPane.showInputDialog("Koliko dugo radis na ovoj poziciji")
				);
		
		if (dob >= 2000 && rad<=2) {
			System.out.println("Oprosti nemas dovoljno iskustva");
		}else if (dob >= 1990 && dob <= 1999 && rad>3 && rad <5) {
			System.out.println("Imamo poziciju za vas kao middle developera");
		}else if (dob >= 1970 && dob <=1989 && rad >=5) {
			System.out.println("Rado bismo vas zaposlili na nekoj bitnijoj poziciji");
		}else {
			System.out.println("Molim vas da nam podijelite vise informacija");
		}
		
 	}

}
