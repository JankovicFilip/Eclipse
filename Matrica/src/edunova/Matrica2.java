package edunova;

import javax.swing.JOptionPane;

public class Matrica2 {
	
	public static void main(String[] args) {
		
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova:"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca:"));
		
		
		int[][] matrica = new int [red][stupac];
		
		int v=1, s=0, ms=stupac-1, r=0,mr=red-1;
		
		
		while(v<=red*stupac) {
			if(v>red*stupac)
				break;
			for(int i=mr;i>=r;i--) {
				
				matrica[i][ms]=v;
				v++;
				
			}
			if(v>red*stupac)
				break;
			for(int i=ms-1;i>=s;i--) {
				
				matrica[r][i]=v;
				v++;
				
			}
			if(v>red*stupac)
				break;
			for(int i=r+1;i<=mr;i++) {
				
				matrica[i][s]=v;
				v++;
				
			}
			if(v>red*stupac)
				break;
			for(int i=s+1;i<=ms-1;i++) {
				
				matrica[mr][i]=v;
				v++;
				
			
			}
			
			
			
			
			
			r++;
			ms--;
			mr--;
			s++;
			
			
			
			
			
			
			
			
		}
		
		for(int i=0;i<red;i++) {
			for(int k=0;k<stupac;k++) {
				System.out.print(matrica[i][k] + "\t");
			}
			System.out.println();
		}
			
			
			
		
		
		
		
		
		
		
		
		
	}

}