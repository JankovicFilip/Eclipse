package edunova.model;

import java.util.Date;
import java.util.List;

public class Grupa extends Entitet { // extenda entitet a ne predavaca i smjer
	private String naziv;
	private Smjer smjer; //  ne stavlja se int
	private Predavac predavac; // ne stavlja se int   I STAVIO  SAM PRODAVAC A NE PREDAVAC, MORAM PROMIJENITI
	private Date datumpocetka;
	private List<Polaznik> polaznici;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Smjer getSmjer() {
		return smjer;
	}
	public void setSmjer(Smjer smjer) {
		this.smjer = smjer;
	}
	public Predavac getPredavac() {
		return predavac;
	}
	public void setPredavac(Predavac predavac) {
		this.predavac = predavac;
	}
	public Date getDatumpocetka() {
		return datumpocetka;
	}
	public void setDatumpocetka(Date datumpocetka) {
		this.datumpocetka = datumpocetka;
	}
	public List<Polaznik> getPolaznici() {
		return polaznici;
	}
	public void setPolaznici(List<Polaznik> polaznici) {
		this.polaznici = polaznici;
	}
	@Override
		public String toString() {
			return naziv;
		}
	
	
}
