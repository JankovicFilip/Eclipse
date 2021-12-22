package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	public static void main(String[] args) {
	
		
		// za uneseni cijeli broj program ispisuje dali je prim broj ili nije
		
		// prim broj je onaj koji je cijelobrojno dijeljiv sa brojem 1 i sam sa sobom
		
		int broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		boolean prim = true;
		for(int i =2;i<broj;i++) {
			//System.out.println(broj + "%" + i + "=" +broj%i);
			if(broj%i==0) {
				//System.out.println("Nije prim broj");
				prim=false;
				break;
			}
		}
		System.out.println(broj + " " + (prim ? "Je": "Nije") + " Prim broj");
		
		// ispisati sve prim brojeve izmedu 278 i 2455
		
		// rijesenje
		boolean prim2=true;
		for(int t = 278;t<2455;t++) {
			prim2=true;
			for(int i=2;i<t;i++) {
				if(t%i==0) {
					prim2=false;
					break;
				}
			}
			if(prim2) {
				System.out.println(t);
			}
		}
			
			
			
			
		
	}

}
