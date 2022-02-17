package edunova;

import javax.swing.JOptionPane;

public class E04_TipPodatkaBezParametara {
	
	public static void main(String[] args) {
		int i= ucitajBroj();  // povezano sa linijom 20
		int j= ucitajBroj();
		
		System.out.println(i+j);
		
	}
	
	public static int ucitajBroj() { //trenutno javlja gresku kada je prazno
		
		//return 0; // ne raditi, ali ovako nemamo code sa sintaksnom greskom
		
		int vrati=0;
		
		while(true) {
			vrati=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj veci od 0")); // jedan code ali ucitava vise brojeva
			if(vrati>0) {
				break;
			}
		}
		
		return vrati;
	}
	
	public static boolean slucajniBoolean() { //zelimo da vrati slucajni boolean
		
		int i= (int)(Math.random()*10);
		
		if(i>=5) {
			return false; // metodu prekidamo sa naredbom return, short circuiting, gledati kako sto prije otici van
		}
		
		return true;
	}
	
	public static int[] ucitajNiz() {
		int[] niz = new int[ucitajBroj()];
		
		for(int i=0;i<niz.length;i++) {
			niz[i]=ucitajBroj();
		}
		return niz;
	}

}
