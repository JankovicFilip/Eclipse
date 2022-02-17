package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
		// napisite metodu koja na primljenom nizu decimalnih brojeva
		// vraca prvi ciji decimalni dio je veci od 5

	
	//private static float ucitajBroj() {
		//float i = 0F;
		//while(true) {
			//i=Float.parseFloat(JOptionPane.showInputDialog("Unesi decimalni broj"));
			//if(i>0) {
			//	return i;
			//}
			
		//}
	//}
	
	private static float prvi(float[] niz) {
		for(float f:niz) {
			if(f-(int)f>0.5) {
				return f;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		float[] niz= {2.1F,289.49F,3.6F,23.3F,1.89F};
		System.out.println(prvi(niz));
		
	}

}
