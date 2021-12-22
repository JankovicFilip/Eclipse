package edunova;

public class E02_DoWhilePetlja {
	
	public static void main(String[] args) {
		
		int i =10;
		for(;i>10;i++) {
			System.out.println(i);
		}
		
		// nece ulaziti u while i for petlju
		while(i>10) {
			System.out.println("Osijek");
		}
		
		
		
		// koristi se gdje se nesto mora unjeti barem jednom
		do {
			System.out.println("edunova");
		}while(i>10);
		
		
		// beskonacno
		
		do {
			System.out.println("Osijek");
			break;
		}while(true);
		
		
	}

}
