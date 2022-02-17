package edunova;

public class ZivotniVijekObjekta {
	
	// 1. svojstvo je deklarirano, vrijednost je null
	private ZivotniVijekObjekta zivotniVijekObjekta;
	
	
	// 2. konstruiranje
	
	public ZivotniVijekObjekta() {
		// izvodi se pri izvodjenju linije koda sa kljucnom rjecju new
		System.out.println("U konstruktoru");
		
	}
	
	
	
	public ZivotniVijekObjekta getZivotniVijekObjekta() {
		return zivotniVijekObjekta;
	}

	public void setZivotniVijekObjekta(ZivotniVijekObjekta zivotniVijekObjekta) {
		this.zivotniVijekObjekta = zivotniVijekObjekta;
	}
	
	public static void main(String[] args) {
		// poziv konstruktora
		System.out.println("Na pocetku izvodenja programa");
		ZivotniVijekObjekta zivotniVijekObjekta = new ZivotniVijekObjekta();
		// 3. koristenje
		
		zivotniVijekObjekta.setZivotniVijekObjekta(null);
		System.out.println("Koristenje objekta");
		
		// 4. unistenje, radi GC - garbage collector
		// ovo ne moramo raditi
		System.out.println("GC ga sam unisti");
		
		
		
		
	}
	
	
	

}
