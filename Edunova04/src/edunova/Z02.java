package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	// ovo dovrsiti
	
	
	public static void main(String[] args) {
		
		
		// za upisani cijeli broj ispisati samo prvu znamenku
		
		// 115555 -> 1 2333->2
		
		
				
		int broj =	Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		
		while (broj>=10) {
			broj/=10;
			System.out.println(broj);
		}
		
		//ispisati broj na mjestu jedinice zadnji broj
		
		
		int broj2 =	Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		
		while (broj2>=10) {
			//broj2%10;
			System.out.println(broj2);
		}
	
	}

}
