package edunova;

public class E03_VoidSaParametrima {
	
	
	public static void main(String[] args) { // ctrl left click da se vidi sto prizivas
		zbroji(2,3);
		primBrojevi(5,50);
		primBrojevi(50);
	}
	
	public static void zbroji(int i, int j) {
		System.out.println(i+j);
	}
	
	
	protected static void primBrojevi(int min, int max) { // metoda sa 2 parametra
		boolean prim;
		for(int i=min; i<=max;i++) {
			prim=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prim=false;
					break;
				}
			}
			if(prim) {
				System.out.println(i);
			}
		}
	}
	
	// method overloading
	// metoda se isto zove, 
	// jedinstveni identifikator je nazin i lista parametra
	private static void primBrojevi(int max) {
		primBrojevi(2,max); // korisniku dajem mogucnost da na razlicite nacine priziva moju metodu
		
	}

}
