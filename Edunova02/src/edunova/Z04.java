package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	public static void main(String[] args) {
		//napisite program koji za danu sirinu i duzinu igralista ispisuje
		// koje se sportovi mogu igrati
		// nogomet 6500 - 7000m2
		// rukomet 800m2
		// rugby 7000m2
		
		int duzina_terena= Integer.parseInt(
				JOptionPane.showInputDialog("Unesi duzinu terena")
				);
				
		int sirina_terena = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi sirinu terena")
				);	
		
		int kolicina = sirina_terena * duzina_terena;
		
		if (kolicina >= 6500 && kolicina <= 6999) {
			System.out.println("Nogomet i rukomet");
		}else if (kolicina >= 7000) {
			System.out.println("Svi sportovi");
		}else if (kolicina >= 800 && kolicina <= 6499) {
			System.out.println("Rukomet");
		}else {
			System.out.println("Na ovom terene se ne moze igrati niti jedan sport");
		}
			
	}

}
