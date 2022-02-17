package edunova;

import java.math.BigDecimal;
import java.util.Date;

public class Start {
	public Start() {
		Oblik o = new Oblik("a3");
		o.setName("prvi");
		System.out.println(o.getName());
		o.setName("drugi");
		System.out.println(o.getName());
		
		Trokut t = new Trokut("a3");
		t.setName("Prvi");
		System.out.println(t.getName());
		t.setPrefix("a4");
		System.out.println(t.getName());
		
		Racun r = new Racun(1,new Date(),BigDecimal.ZERO,"Edunova");
		System.out.println(r.getDatum());
		System.out.println(r.getIznos()); // big decimal je prikazao 0 a ne 0.0 kao double i float
		r.setIznos(r.getIznos().add(new BigDecimal(100)));
		
		// ciklicnu matricu preraditi da radi iskljucivo sa konzolama, znaci scanner
		
		
		
		// CITATI OVO OD PROFESORA https://github.com/tjakopec/OOP_JAVA_PHP_PYTHON_SWIFT
	}

	
	public static void main(String[] args) {
		new Start();
	}
}
