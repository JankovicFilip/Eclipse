package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	public static void main(String[] args) {
		
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Ucitaj broj izmedu -2000000000 i -2000000000"));

		int broj2 = broj%2;
		
		boolean tocno = broj2==0;
		
		System.out.println(tocno);

	}
}