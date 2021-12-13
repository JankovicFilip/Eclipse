package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	
	public static void main(String[] args) {
		int broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj izmedu 10 i 20")
				);
		
		System.out.println(broj/broj+6);
	}

}
