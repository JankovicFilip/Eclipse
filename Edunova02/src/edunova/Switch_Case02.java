package edunova;

import java.time.Month;

import javax.swing.JOptionPane;

public class Switch_Case02 {
	
	public static void main(String[] args) {
		int mjesec = Integer.parseInt(
				JOptionPane.showInputDialog("Koji mjesec Vam je najdraži?")
				);
		String monthString = null;
		
		// tu napraviti joption godina
		int godina = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite Vama najuspiješniju godinu.")
				);
		int brojdana = 0;
		
		switch (mjesec) {
		case 1:
			monthString = "Sijećanj";
			brojdana = 31;
			break;
		case 3:
			monthString = "Ožujak";
			brojdana = 31;
			break;
		case 5:
			monthString = "Svibanj";
			brojdana = 31;
			break;
		case 7:
			monthString = "Srpanj";
			brojdana = 31;
			break;
		case 8:
			monthString = "Kolovoz";
			brojdana = 31;
			break;
		case 10:
			monthString = "Listopad";
			brojdana = 31;
			break;
		case 12: //u svaki case staviti monthString="Sijecan" i broj dana
			monthString = "Prosinac";
        	brojdana = 31;
        	break;
        case 4:
        	monthString = "Travanj";
        	brojdana = 30;
        	break;
        case 6:
        	monthString = "Lipanj";
        	brojdana = 30;
        	break;
       	case 9:
       		monthString = "Rujan";
        	brojdana = 30;
        	break;
       	case 11:
       		monthString = "Studeni";
        	brojdana = 30;
        	break;
        case 2: if (((godina % 4 == 0) && 
                !(godina % 100 == 0))
                || (godina % 400 == 0))
               brojdana = 29;
           else
               brojdana = 28;
        		monthString = "Veljača";
           break;
         default:
        	 System.out.println("Unijeli ste ne postojeći mjesec");

        
        	
		}
		System.out.println("Godine " + godina + ". u mjesecu " + monthString + " koji ima " + brojdana + " dan/a " + "vam je bilo najuspiješnije razdoblje!!!");
		
	}

}
