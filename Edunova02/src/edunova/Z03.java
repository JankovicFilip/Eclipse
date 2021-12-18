package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	public static void main(String[] args) {
		// program unosi dvije logicke vrijednosti u slucaju da su obje istinite ispisuje da
		
		boolean prvi = Boolean.parseBoolean(
				JOptionPane.showInputDialog("Upisi true ili false")
				);
		boolean drugi = Boolean.parseBoolean(
				JOptionPane.showInputDialog("Upisi ponovo true ili false")
				);
		
		System.out.println((prvi==drugi) ? "Da" : "Ne");
		//if (prvi==drugi) {
			//System.out.println("DA");
		//}else {
			//System.out.println("NE");
		//}
	}

}
