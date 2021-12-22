package edunova;

public class E01_WhilePetlja {
	
	public static void main(String[] args) {
		int i = 2;
		boolean uvjet = i<10;
		
		while(uvjet) { // rjede se vidja 
			System.out.println(i);
			i++;
			uvjet = i<10;
		}
		
		// cesce
		
		i=2;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		// 3. nacin
		
		i=2;
		while(i<10) {
			System.out.println(i++);
		}
		
		// continue, break, ugnjezdivane je jednako kao kod for komande
		
		
		
		
		// beskonacna petlja
		
		while(true) {
			System.out.println("Osijek");
			break;
		}
		
	
	}

}
