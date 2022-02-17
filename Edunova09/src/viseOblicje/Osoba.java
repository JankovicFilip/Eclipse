package viseOblicje;

// abstraktna klasa je klasa koja nema implementaciju (nije moguce napraviti intancu)
// kreira se kako bi sadrzavala zajednicka svojstva svim podklasama koje ju nasljede
// ne mogu onda instancirati u konstruktoru tj start

public abstract class Osoba {
	private String ime;
	private String prezime;
	
	public abstract String predstaviSe();

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
}
