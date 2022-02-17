package edunova;

import java.math.BigDecimal;
import java.util.Date;

public class Dokument {
	// date iz java.util obavezno
	private int sifra;
	private Date datum;
	private BigDecimal iznos; // BigDecimal iz java.math
	
	
	
	public Dokument(int sifra, Date datum, BigDecimal iznos) {
		super(); // znaci da je dokument nasljedio Object
		this.sifra = sifra;
		this.datum = datum;
		this.iznos = iznos;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public BigDecimal getIznos() {
		return iznos;
	}
	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}
	
	

}
