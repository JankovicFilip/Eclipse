package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {
		// program unosi dva cijela broja ako je njihov zbroj paran broj ispisuje Osijek inace ispisuje Zagreb
		
		int broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		int broj2 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj drugi puta")
				);
		
		int zbroj = broj + broj2;
		
		System.out.println((zbroj%2==0) ? "Osijek" : "Zagreb");
		//if(zbroj%2==0) {
			//System.out.println("Osijek");
			
		//}else {
		//	System.out.println("Zagreb");
		//}
	}

}
