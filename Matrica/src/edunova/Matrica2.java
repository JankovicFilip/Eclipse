package edunova;

import javax.swing.JOptionPane;

public class Matrica2 {
	
	public static void main(String[] args) {
		
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova:"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca:"));
		
		
		int[][] matrica = new int [red][stupac];
		
		int v=1, s=0, ms=stupac-1, r=0,mr=red-1;
		
		
		while(v<=red*stupac) {
			for(int i=ms;i>=s;i--) {
				
				matrica[i][mr]=v;
				v++;
				
				if(v>red*stupac) {
					break;
				}
			}
			
			for(int i=mr-1;i>=r;i--) {
				
				matrica[s][i]=v;
				v++;
				
				if(v>red*stupac) {
					break;
				}
			}
			
			for(int i=s+1;i<=ms;i++) {
				
				matrica[i][r]=v;
				v++;
				
				if(v>red*stupac) {
					break;
				}
			}
			for(int i=r+1;i<mr;i++) {
				
				matrica[ms][i]=v;
				v++;
				
				if(v>red*stupac) {
					break;
				}
			}
			
			
			
			
			
			mr--;
			ms--;
			r++;
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