package edunova;

public class Start03 {
	
	private Mobitel mobitel;
	
	public Start03() {
		mobitel = new Mobitel();
		mobitel.setNaziv("Galaxy 15");
		mobitel.setProizvodac("Samsung");
		
		System.out.println(mobitel.getNaziv());
		
		mobitel = new Mobitel("Iphone","Apple");
		
		System.out.println(mobitel.getNaziv());
		
	}
	
	
	// novi nacin rada sa main metodom, pozvati konstruktor klase u kojoj se nalazimo
	public static void main(String[] args) {
		new Start03();
	}

}
