package edunova;

public class Mobitel {
	
	private String naziv;
	private String proizvodac;
	
	
	
	
	public Mobitel() {
		
	}
	
	// isto kao i sa getter i setter samo kliknem na constructor using field
	public Mobitel(String naziv, String proizvodac) {
		this.naziv = naziv;
		this.proizvodac = proizvodac;
	}


	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getProizvodac() {
		return proizvodac;
	}
	public void setProizvodac(String proizvodac) {
		this.proizvodac = proizvodac;
	}
	
	
	
	
}
