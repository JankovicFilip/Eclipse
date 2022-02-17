package edunova.mojprojekt;

public class Kupac extends Entitet {
	private String ime;
	private String prezime;
	private String email;
	private String adresa;
	private String brojtelefona;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getBrojtelefona() {
		return brojtelefona;
	}
	public void setBrojtelefona(String brojtelefona) {
		this.brojtelefona = brojtelefona;
	}

}
