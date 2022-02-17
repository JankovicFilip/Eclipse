package edunova;

import javax.swing.JOptionPane;

public class Zadatak {
	public static void main(String[] args) {
		
		
		boolean prim = true;
		int suma = 0;
		
		for (int i=2;i<=100;i++) {
			prim = true;
			for(int k=2;k<i;k++) {
				if(i%k==0) {
					prim = false;
					break;
				}
			}if (prim) {
				suma+=i;
		}
		}
		System.out.println(suma);
		
	}
	
	

}
