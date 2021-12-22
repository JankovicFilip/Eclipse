package edunova;

public class E03_ForEachPetlja {
	
	public static void main(String[] args) {
		
		// for each petlja
		
		int[] niz = {1,2,3,4,5,3,3,2,5};
		for(int i = 0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		// jednostavnija sintaksa
		
		for(int i:niz) {
			System.out.println(i);
		}
		
		// ne postoji posebna  for each beskonacna petlja
		
		
	}

}
