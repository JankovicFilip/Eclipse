package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {
		int broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi Broj")
				);
		System.out.println(broj);
		
		int broj2 = Integer.parseInt(
				JOptionPane.showInputDialog("unesi drugi broj")
				);
		System.out.println(broj-broj2);
	}

}
