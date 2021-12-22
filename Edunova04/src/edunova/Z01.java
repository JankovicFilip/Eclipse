package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	public static void main(String[] args) {
		
		
		// program unosi broj izmedu 1 i 10 i ispisuje
		
		int i;
		while(true) {
			i = Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj izmedu 1 i 10"));
			if(i<1 || i>10) {
				JOptionPane.showMessageDialog(null,"Broj nije trazen");
				continue;
				
			}
			System.out.println(i);
			break;
			
			
		}
		
		// istu funkcionalnost realizarati s for
		
		// copy paste samo umjesto while(true) se stavi for(;;) jer je u pitanju beskonacna petlja
		for(;;) {
			i = Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj izmedu 1 i 10"));
			if(i<1 || i>10) {
				JOptionPane.showMessageDialog(null,"Broj nije trazen");
				continue;
				
			}
			System.out.println(i);
			break;
			
			
		}
		
	}

}
