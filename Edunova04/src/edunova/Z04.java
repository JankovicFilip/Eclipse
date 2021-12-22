package edunova;

public class Z04 {
	
	public static void main(String[] args) {
		
		
		// koristeci se do while petlju ispisite zbroj svih parnih brojeve od 98 do 27
		
		
		int i = 98;
		int suma = 0;
		do {
			if(i%2==0) { //if ide kada moram modulo koristiti
				suma+=i--;
			}
		}while(i-->27);
		System.out.println(suma);
		
		
	}

}
