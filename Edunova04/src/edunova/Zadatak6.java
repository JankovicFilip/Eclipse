package edunova;

import javax.swing.JOptionPane;

public class Zadatak6 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		
		
		for(int i=a;i>=2;i--) {
			if(i%2==0 && i !=2) {
				System.out.println(i+ ",");
			}
						
		}
		System.out.println("2");
		
		
	}

}
