package edunova;

import javax.swing.JOptionPane;

public class Z04_inline {
	
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
		
		
		System.out.println((kolicina >= 6500 && kolicina <= 6999) ? "Nogomet i rukomet" : (kolicina >= 7000) ? "Svi sportovi" : (kolicina >= 800 && kolicina <= 6499) ? "Rukomet" : "Na ovom terenu se ne moze igrati niti jedan sport");
		
			
	}

}
