package edunova;

import javax.swing.JOptionPane;

public class Z02_inline {
	// program unosi 3 cijela broja i ispusuje najmanji
	public static void main(String[] args) {
		int broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		int broj2 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj drugi puta")
				);
		int broj3 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj treci puta")
				);
		
		System.out.println((broj<=broj2 && broj<=broj3) ? broj : (broj2<=broj && broj2<=broj3) ? broj2 : broj3);
		
	}

}
