package edunova;

import javax.swing.JOptionPane;

public class Matricazadatak {
	
	public static void main(String[] args) {
		
		
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova:"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca:"));
		
		
		int[][] matrica = new int [red][stupac];
		
		int v=0, s=0, r=0, ms=stupac-1, mr=red-1;
		
		
		while(v<=red*stupac) {
			for(int i=ms;i>=ms;i--) {
				matrica[mr][i]=v;
				if(v>red*stupac) {
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
