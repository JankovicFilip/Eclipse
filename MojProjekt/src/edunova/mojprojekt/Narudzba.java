package edunova.mojprojekt;

import java.util.Date;
import java.util.List;

public class Narudzba extends Entitet {
	private Kupac kupac;
	private Date datumNarudzbe;
	private Date datumOtpreme;
	private List<GamingXRacunalo> racunala;
	private List<Komponenta> komponente;
	
	public List<GamingXRacunalo> getRacunala() {
		return racunala;
	}
	public void setRacunala(List<GamingXRacunalo> racunala) {
		this.racunala = racunala;
	}
	public List<Komponenta> getKomponente() {
		return komponente;
	}
	public void setKomponente(List<Komponenta> komponente) {
		this.komponente = komponente;
	}
	public Kupac getKupac() {
		return kupac;
	}
	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}

	public Date getDatumNarudzbe() {
		return datumNarudzbe;
	}
	public void setDatumNarudzbe(Date datumNarudzbe) {
		this.datumNarudzbe = datumNarudzbe;
	}
	public Date getDatumOtpreme() {
		return datumOtpreme;
	}
	public void setDatumOtpreme(Date datumOtpreme) {
		this.datumOtpreme = datumOtpreme;
	}
	
	
}
