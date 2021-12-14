package edunova;

import javax.swing.JOptionPane;

public class Z06 {
	public static void main(String[] args) {
		int x = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj izmedu 10 i 20")
				);
		
		int y = x%10;
		
		System.out.println(y);
				
	}

}
