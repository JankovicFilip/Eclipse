package edunova;

public class E04_ForPetlja {
	
	public static void main(String[] args) {
		
		// ispisite 10 osijek
		
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		System.out.print("Osijek, ");
		
		// for petlja, sintaksa je (od kuda; do kuda; uvecanje; umanjenje)
		
		// ispisuje 10 puta osijek u ovom primjeru
		
		System.out.println();
		for(int i=0;i<10;i=i+1) {
			System.out.print("Osijek, ");
			
		}
		
		
		// varijabla kod petlje se tijekom izvodenja mijenja
		System.out.println();
		
		for(int i=0;i<10;i=i++) {
			System.out.println(i);
			break;
		}
		
		// sve parne brojeve od 1 do 10
		System.out.println();
		for(int i=1;i<10;i=i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
