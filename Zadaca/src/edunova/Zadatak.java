package edunova;

import javax.swing.JOptionPane;

public class Zadatak {
	public static void main(String[] args) {
		System.out.println("Hello");
	
	
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		System.out.println("Vaš rezultat je " + (broj+broj2));
	
	}
	
	

}
