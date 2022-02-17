package edunova;

public class E01_Metode {
	
	
	// public je nacin pristupa
	// staticna metoda moze pozvati samo staticnu metodu, static oznacava da metodu mozemo pozvati bez instanciranja class
	// void je (mjesto) tip podatka, void znaci da ne vraca vrijednost
	// naziv metode (main) 
	// u zagradi () lista parametara koje metoda prima
	public static void main(String[] args) {
		
		pozdravi();
	
			
	}
	
	// rad sa metodama podrazumijeva
	// 1. napisati metodu
	// 2. pozvati metodu, gore sam napisao pozdravi u public static void main
	private static void pozdravi() {
		System.out.println("Hello world!");
		System.out.println("------------");
	}

}
