package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	
	public static void main(String[] args) {
		// program ucitava 5 cijelih brojeva
		// for each petljom ispisuje sve ucitane brojeve
		// ispisuje prosjek ucitanih brojeva
		
		
		
		int[] broj = new int[5];
		for(int i = 0; i<5;i++) {
			broj[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (i+1) + ". broj"));
			
		}
		int zbroj = 0;
		
		for(int i:broj) {
			System.out.println(i);
			zbroj +=i;
		}System.out.println((float)zbroj/5);
	}

}
