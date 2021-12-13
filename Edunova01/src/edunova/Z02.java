package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {
		double sirina = Double.parseDouble(
				JOptionPane.showInputDialog("Sirina prostora")
				);
		double duzina = Double.parseDouble(
				JOptionPane.showInputDialog("Duzina prostora")
				);
		
		System.out.println(sirina*duzina);
		
				
		
		
	}

}
