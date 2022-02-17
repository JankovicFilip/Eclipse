package edunova;

public class Start02 {
	
	public static void main(String[] args) {
		
		Racun racun = new Racun();
		// ovako treba
		Adresa adresa = new Adresa();
		adresa.setUlica("Ruzina 12");
		
		
		// racun.getAdresa().setUlica("Ruzina 12"); ne raditi
		
		// ovako treba
		racun.setAdresa(adresa);
		
		System.out.println(racun.getAdresa().getUlica());
		
		
		// na adresi postavite zupanija osjecko baransku
		// i ispisite naziv zupanije od objekta racun
		Zupanija zupanija =  new Zupanija();
		zupanija.setNaziv("Osjecko Baranjska zupanija");
		Mjesto mjesto = new Mjesto();
		mjesto.setZupanija(zupanija);
		adresa.setMjesto(mjesto);
		
		
		System.out.println(racun.getAdresa().getMjesto().getZupanija().getNaziv());
		
		
		
	}

}
