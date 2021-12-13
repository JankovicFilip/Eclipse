package edunova;

public class E05_Operatori {
	public static void main(String[] args) {
		
		// operator dodijeljivanja =
		int i = 0;
		
		//operator provjere jednakosti ==
		boolean tocno = i==5;
		
		System.out.println(tocno);
		
		// operator razlicito !=
		tocno = i!=5;
		
		int j,k;
		
		j=3; k=9;
		
		i= j+k;
		System.out.println(i);
		
		i=j-k;
		System.out.println(i);
		
		i=j*k;
		System.out.println(i);
		
		i=j/k;
		System.out.println(i);
		
		double d=j/k;
		System.out.println(d);
		
		d= (double)j/k; // double cast
		System.out.println(d);
		
		
		// ostatak nakon cijelobrojnog dijeljenja - modulo %-- 9%2=1 4*2=8 9-8=1  8%2=0 4*2=8
		j=9; k=2;
		i=j%k;
		System.out.println(i);
		
		
		
		
		
	}

}
