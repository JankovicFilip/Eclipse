package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {
		int sirina = Integer.parseInt(
				JOptionPane.showInputDialog("Sirina prostora")
				);
		int duzina = Integer.parseInt(
				JOptionPane.showInputDialog("Duzina prostora")
				);
		
		System.out.println(sirina*duzina);
		
				
		
		
	}

}
