package edunova.mojprojekt;

public class Korisnik extends Entitet {
	private String korisnickoIme;
	private String zaporka;
	private String email;
	private String ime;
	private String uloga;
	
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getZaporka() {
		return zaporka;
	}
	public void setZaporka(String zaporka) {
		this.zaporka = zaporka;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getUloga() {
		return uloga;
	}
	public void setUloga(String uloga) {
		this.uloga = uloga;
	}

}
