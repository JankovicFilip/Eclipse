package edunova;

public class Z03 {

	
	public static void main(String[] args) {
		
		// ispisite sve brojeve od 20 do 1
		
		//for(int i=20;i>1;i--) {
			//System.out.println(i);
		//}
	
		
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
				
		}
		
		// petlju je moguce preskociti i to je dobra praksa
		
		for(int i=1;i<10;i++) {
			if (i%2!=0) {
				continue; // short cuircuting
			}
			System.out.println(i);
		}
		
		
	// petlju je moguce nasilno prekinuti
		
		for(int i=0;i<10;i++) {
			if(i==2) {
				break; // prekidanje petlje u kojoj se nalazis
			}
		}
		
		// prekidanje vanjske petlje
	
		vanjska:
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				break vanjska;
			}
				
		}
		
		// beskonacna petlja
		// ispisuje random brojeve nonstop dok ne ugasimo program, racunala tako rade
		
		
		// for(;;) {
			// System.out.println(Math.random());
			// break; // sa break se izvodi samo jednom
		// }
		
		// zbrojiti brojeve od 1 do 100
		int suma= 0;
		for(int i=1;i<=100;i++) {
			suma+=i;
			
		}
		System.out.println(suma);
		
		
		int i=0;
		for(;i<10;i++,suma--) {
			
		}
		
		
		
		
		
		
		
	}
}
