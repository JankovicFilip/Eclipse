package model;

public class Sastojak {
	private String naziv;
	private int kolicina;
	
	public Sastojak() {
		super();
	}
	public Sastojak(String naziv, int kolicina) {
		super();
		this.naziv = naziv;
		this.kolicina = kolicina;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	

}
