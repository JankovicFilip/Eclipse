package edunova;


// POJO

// oop, objektno orijentiranje...
// klasa je opisnik objekta
public class Osoba {
	// ovako necemo koristiti
	// int sifra;
	// String ime;
	// String prezime;
	// ne ovako
	
	
	
	// OOP princip, ucahurivanje - encapsulation
	
	// sakrivena ucahurena svostva
	private int sifra;
	private String ime;
	private String prezime;
	private double placa;
	
	// javno dostupne get i set methode, desni click, source, generate getter and setter
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public double getPlaca() {
		return placa;
	}
	public void setPlaca(double placa) {
		this.placa = placa;
	}
	
	
	
	
	
	
	
	

}
