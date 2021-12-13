package edunova;

import javax.swing.JOptionPane;

// paket je direktorij na disku, uobicajeno je da svaka klasa bude u nekom paketu
// klasa je datoteka na disku - osnovna organizacija struktura koda
public class E01_Organizacija {
	// metoda je cjelina koja radi odredenu zadacu
	public static void main(String[] args) {
		
		// komunikacija s korisnikom prema van
	System.out.println("Hello");
	
	// komunkacija s korisnikom prema unutra
	// preduvjet koristenja JOptionPane klase je dodavanje java.desktop u module
	JOptionPane.showInputDialog("Daj mi vrijednost");
		
	}

}
