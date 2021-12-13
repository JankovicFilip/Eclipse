package edunova;

import javax.swing.JOptionPane;

public class E04_PrimitivniTipoviPodataka {
	
	// preimenovanje klase refactor-rename
	
	public static void main(String[] args) {
		
		byte maliCijeliBroj = Byte.parseByte(
				JOptionPane.showInputDialog("Unesi broj od -128 do 127")
				);		
		byte i = 100;
		byte drugi = (byte)(maliCijeliBroj + i); // prijeci ce u negativni dio
		
		System.out.println(drugi);
		
		short maloVeciCijeliBroj = Short.parseShort(
				JOptionPane.showInputDialog("Cijeli Broj -32,768 do 32.767")
				);
	System.out.println(maloVeciCijeliBroj);
	
	
	float f = 3.14F;
	f=Float.parseFloat(
			JOptionPane.showInputDialog("Dec broj sa .")
			);
	System.out.println(f*2);
	
	boolean logickaVrijednost = true;
	logickaVrijednost = Boolean.parseBoolean(
			JOptionPane.showInputDialog("True False")
			);
	
	System.out.println(logickaVrijednost);
	
	char znak = 'a';
	znak = JOptionPane.showInputDialog("unesi znak").charAt(0);
	System.out.println(znak);
	}

}
