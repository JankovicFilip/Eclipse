package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	public static void main(String[] args) {
		
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Number"));

		int broj2 = broj%2;
		
		boolean tocno = broj2==0;
		
		System.out.println(tocno);

	}
}