package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	public static void main(String[] args) {
		
		double duzina_jame = Double.parseDouble(
				JOptionPane.showInputDialog("Duzina jame")
				);
		double dubina_jame = Double.parseDouble(
				JOptionPane.showInputDialog("Dubina septicke jame")
				);
		
		double sirina_jame = Double.parseDouble(
				JOptionPane.showInputDialog("Sirina Jame")
				);
		
		double kolicina_zemlje = duzina_jame * dubina_jame * sirina_jame;
		
		
		System.out.println(kolicina_zemlje);
	}

}
