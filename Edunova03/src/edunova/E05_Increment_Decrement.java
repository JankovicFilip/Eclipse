package edunova;

public class E05_Increment_Decrement {
	
	public static void main(String[] args) {
		
		
		int i=1;
		System.out.println(i);
		i=i+1;
		// uvecao za 1
		System.out.println(i);
		i+=1;
		// uvecao za 2
		System.out.println(i);
		i+=2;
		System.out.println(i);
		
		i++;//uvecao za 1
		System.out.println(i);
		
		System.out.println(++i); // prvo uveca pa koristi
		
		System.out.println(i++); //prvo koristi pa uveca
		
		System.out.println(i);
		
		
		System.out.println(--i); // prvo umanji pa koristi
		System.out.println(i--); // prvo koristi pa umanji
		System.out.println(i);
		
		int t= 1, k=0;
		
		k= k - t++; // k-1 t = 2
		
		t -= --k + ++t; // k-2 +3=1
		System.out.println(k-1);
		
		
	}

}
