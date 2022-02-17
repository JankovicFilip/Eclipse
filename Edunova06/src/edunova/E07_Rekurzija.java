package edunova;

public class E07_Rekurzija {
	
	private static int zbroj(int i) {
		/*if(i==1) {
			return i;
		}
		return i+zbroj(i-1);
		// prvo slaze izraz > 5+4+3+2+1 onda se vraca nazad 1+2+3+4+5
		 
		 */
		return i==1 ? i : i+zbroj(i-1); // inline if
	}
	
	public static void main(String[] args) {
		System.out.println(zbroj(5));
	}

}
