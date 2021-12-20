package edunova;

import javax.swing.JOptionPane;

public class Switch_Case02 {
	
	public static void main(String[] args) {
		int mjesec = Integer.parseInt(
				JOptionPane.showInputDialog("Koji mjesec Vam je najdraži?")
				);
		// tu napraviti joption godina
		int godina = 1993;
		int brojdana = 0;
		
		switch (mjesec) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: //u svaki case staviti monthString="Sijecan" i broj dana
        	brojdana = 31;
        	break;
        case 4: case 6: case 9: case 11:
        	brojdana = 30;
        	break;
        case 2: if (((godina % 4 == 0) && 
                !(godina % 100 == 0))
                || (godina % 400 == 0))
               brojdana = 29;
           else
               brojdana = 28;
           break;

        
        	
		}
		
	}

}
