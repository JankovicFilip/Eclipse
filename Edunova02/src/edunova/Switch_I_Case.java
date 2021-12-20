package edunova;

import javax.swing.JOptionPane;

public class Switch_I_Case {
	
	public static void main(String[] args) {
		
		int mjesec=Integer.parseInt(
				JOptionPane.showInputDialog("Koji mjesec ti je najdrazi?")
				);
		String monthString;
		switch (mjesec) {
		case 1:
			monthString = "Sijećanj";
			break;
		case 2:
			monthString = "Veljača";
			break;
		case 3:
			monthString = "Ožujak";
			break;
		case 4:
			monthString = "Travanj";
			break;
		case 5:
			monthString = "Svibanj";
			break;
		case 6:
			monthString = "Lipanj";
			break;
		case 7:
			monthString = "Srpanj";
			break;
		case 8:
			monthString = "Kolovoz";
			break;
		case 9:
			monthString = "Rujan";
			break;
		case 10:
			monthString = "Listopad";
			break;
		case 11:
			monthString = "Studeni";
			break;
		case 12:
			monthString = "Prosinac";
			break;
			default:
				monthString = "Ovo nije mjesec";
		}
		System.out.println(monthString);
		
	}

}
