package model;

import java.math.BigDecimal;
import java.util.List;

public class Sendvic extends Sastojak {
	private String naziv;
	private List<Sastojak> sastojci;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public List<Sastojak> getSastojci() {
		return sastojci;
	}
	public void setSastojci(List<Sastojak> sastojci) {
		this.sastojci = sastojci;
	}
	
	public int getTezina() {
		
		int suma = 0;
		for(Sastojak s:sastojci) {
			suma+=s.getKolicina();
		}
		
		
		return suma;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return naziv + " " + getTezina();
	}
	
	public BigDecimal getProsjecnaTezinaSastojka() {
		
		
		
		return new BigDecimal((float)getTezina()/sastojci.size());
	}

}
