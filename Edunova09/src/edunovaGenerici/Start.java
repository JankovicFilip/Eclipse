package edunovaGenerici;

import java.util.ArrayList;
import java.util.List;

import viseOblicje.Predavac;

public class Start {
	
	public Start() {
		
		
		ArrayList al = new ArrayList<>();
		
		String t = "Ana";
		
		Predavac p = new Predavac();
		
		al.add(t);
		al.add(p);
		// ovo gore nije dobro, stari nacin
		
		
		
		ArrayList<String> gradovi = new ArrayList<>();
		
		gradovi.add("Osijek");
		gradovi.add(t);
		gradovi.add("Valpovo");
		
		for(String s:gradovi) {
			System.out.println(s);
		}
		// ovo gore moze bolje
		
		
		// https://medium.com/zero-equals-false/arraylist-vs-linkedlist-vs-vector-22e1721a66b0
		// OVO CITATI
		
		
		List<String> imena = new ArrayList<>();
		
		imena.add("Mario");
		imena.add(t);
		
		// 5. nacin iteracije podataka
		// funcktional programming
		imena.forEach(s-> System.out.println(s) ); // -> lambda operator;
		
		
	
		
		
		
	}
	
	public static void main(String[] args) {
		new Start();
	}

}
